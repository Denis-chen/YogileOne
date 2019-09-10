package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ChatServer {
    private int DEFAULT_PORT = 8888;
    private final String QUIT = "quit";

    // 接受各个客户端发起的连接请求
    private ServerSocket serverSocket;
    // Integer:客户指示ID（客户端端口），以及对应发送信息 Writer，记录目前时间在线的所有客户及Writer
    private Map<Integer,Writer> connectedClients;

    //构造函数
    public ChatServer() {
        connectedClients = new HashMap<>();
        // 初始化 Map
    }

    // 用户加入
    public synchronized void addClient(Socket socket) throws IOException {
        // synchronized 保证同一时间只有一个线程在调用，线程安全性 ????
        // 确定socket非空
        if (socket != null) {
            int port = socket.getPort();
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())
            );
            // new OutputStreamWriter(socket.getOutputStream())中getOutputStream()可能会抛出异常

            // 加入 Map
            connectedClients.put(port,writer);
            System.out.println("客户端[" + port + "]已连接到服务器");
        }
    }

    // 用户退出
    public synchronized void removeClient(Socket socket) throws IOException {
        // synchronized 保证同一时间只有一个线程在调用，线程安全性 ????
        // 确定socket非空
        if (socket != null) {
            int port = socket.getPort();
            // 判断 port 客户是否存在 Map 中
            if (connectedClients.containsKey(port)) {
                // containsKey() 判断函数 ？？？
                connectedClients.get(port).close();
                // connectedClients.get(port) 返回 port 对应 Writer
                // connectedClients.get(port).close();中.close()可能会抛出异常
            }


            // 移出 Map
            connectedClients.remove(port);
            System.out.println("客户端[" + port + "]已断开连接");
        }
    }

    // 服务器收到一客户消息，转发到其他客户
    public synchronized void forwordMessage(Socket socket, String fwdMsg) throws IOException {
        // synchronized 保证同一时间只有一个线程在调用，线程安全性 ????
        // 遍历客户
        for (Integer id : connectedClients.keySet()) {
            // 将发送者排除
            if (!id.equals(socket.getPort())) {
                // 取得客户 writer
                Writer writer = connectedClients.get(id);
                writer.write(fwdMsg);
                // writer.write(fwdMsg);中，write(fwdMsg)可能会抛出异常
                writer.flush();
            }
        }
    }

    // 检查客户是否决定退出
    public boolean readyToQuit (String msg) {
        return QUIT.equals(msg);
    }

    // 封装所有关闭和释放serverSocket资源的代码
    public synchronized void close() {
        // synchronized 保证同一时间只有一个线程在调用，线程安全性 ????
        if (serverSocket != null) {
            try {
                serverSocket.close();
                // serverSocket.close();可能会抛出异常，抓住异常以便处理
                System.out.println("关闭serverSocket");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 服务器端启动后的主要逻辑
    public void start() {
        try {
            // 绑定监听端口
            serverSocket = new ServerSocket(DEFAULT_PORT);
            // new ServerSocket(DEFAULT_PORT)可能会抛出异常，抓住异常以便处理
            System.out.println("服务器启动，监听端口：" + DEFAULT_PORT + "...");

            while (true) {
                // 等待客户端连接，阻塞
                Socket socket = serverSocket.accept();
                // 创建 ChatHandler 线程
                new Thread(new ChatHandler(this,socket)).start();
                // ????????????
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 调用close()，释放系统资源
            close();
        }
    }

    public static void main(String[] args) {
        ChatServer server = new ChatServer();
        server.start();
    }
}
