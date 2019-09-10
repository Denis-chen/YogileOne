package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatHandler implements Runnable{
    private ChatServer server;
    private Socket socket;

    public ChatHandler(ChatServer server, Socket socket) {
        this.server = server;
        this.socket = socket;
    }

    // 实现 Runnable 接口，就要实现 run() 函数
    @Override
    public void run() {
        try {
            // 存储了新上线用户
            server.addClient(socket);

            // 读取用户发送的信息
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String msg = null;
            while ((msg = reader.readLine()) != null) {
                /*
                System.out.println("客户端[" + socket.getPort() + "]:" + msg);

                // 将收到的消息转发给聊天室在线用户
                server.forwordMessage(socket, msg+"\n");
                // readLine()读取的消息不包括转行符，forwordMessage(socket, msg+"\n")不加"\n"，否则readLine()无法返回
                */
                String fwdMsg = "客户端[" + socket.getPort() + "]:" + msg + "\n";
                System.out.println(fwdMsg);

                // 将收到的消息转发给聊天室在线用户
                server.forwordMessage(socket, fwdMsg);

                // 检查用户是否退出
                if (server.readyToQuit(msg)) {
                    break;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //
                server.removeClient(socket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
