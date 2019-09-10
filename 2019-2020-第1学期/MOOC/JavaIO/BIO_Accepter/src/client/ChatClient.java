package client;

import java.io.*;
import java.net.Socket;

public class ChatClient {

    private final String DEFAULT_SERVER_HOST = "127.0.0.1";
    private final int DEFAULT_SERVER_PORT = 8888;
    private final  String QUIT = "quit";

    private Socket socket;
    private BufferedReader reader;
    private BufferedWriter writer;

    // 使用默认构建函数

    // 发送消息给服务器
    public void send(String msg) throws IOException {
        // 确定 socket 输出流尚未关闭
        if (!socket.isOutputShutdown()) {
            writer.write(msg+"\n");
            writer.flush();
            // write(msg+"\n"),flush()可能会抛出异常
        }
    }

    // 从服务器接收消息
    public String receive() throws IOException {
        String msg = null;
        // 确定 socket 输入流尚未关闭
        if (!socket.isInputShutdown()) {
            msg = reader.readLine();
            // readLine()可能会抛出异常
        }
        return msg;
    }

    // 检查用户是否准备退出
    public boolean readyToQuit(String msg) {
        return QUIT.equals(msg);
    }

    // 封装所有关闭和释放socket资源的代码
    public synchronized void close() {
        // synchronized 保证同一时间只有一个线程在调用，线程安全性 ????
        // 关闭 writer
        if (writer != null) {
            try {
                System.out.println("关闭socket");
                writer.close();
                // writer.close();可能会抛出异常，抓住异常以便处理
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 客户端启动后的主要逻辑
    public void start() {
        try {
            // 创建 socket
            socket = new Socket(DEFAULT_SERVER_HOST, DEFAULT_SERVER_PORT);

            // 创建IO流
            reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            writer = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())
            );

            // 处理用户的输入
            new Thread(new UserInputHandler(this)).start();

            // 读取服务器转发的消息
            String msg = null;
            while ((msg = receive()) != null ) {
                System.out.println(msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 释放系统资源
            close();
        }
    }

    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient();
        chatClient.start();
    }
}
