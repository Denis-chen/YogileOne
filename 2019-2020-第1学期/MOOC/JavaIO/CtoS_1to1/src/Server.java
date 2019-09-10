import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        final int DEFAULT_PORT = 8888;
        final String EXIT = "exit";
        ServerSocket serverSocket = null;

        try {
            // 绑定监听端口
            serverSocket = new ServerSocket(DEFAULT_PORT);
            System.out.println("服务器启动，端口[" + DEFAULT_PORT + "]监听中");

            while (true) {
                // 等待客户连接，accept()是阻塞式的，等待连接
                Socket socket_s = serverSocket.accept();
                System.out.println("客户端[" + socket_s.getPort() + "]已连接");

                //
                BufferedReader reader_s = new BufferedReader(
                        new InputStreamReader(socket_s.getInputStream())
                );
                BufferedWriter writer_s = new BufferedWriter(
                        new OutputStreamWriter(socket_s.getOutputStream())
                );

                String msg = null;
                while ( (msg = reader_s.readLine()) != null) {
                    // 读取客户端发送的消息

                    System.out.println("客户端[" + socket_s.getPort() + "]:" + msg);

                    //回复客户发送的消息，加 \n 是为了客户端使用 readline() 读取 String
                    writer_s.write("服务器:" + msg +"\n");
                    // 确保缓冲区中所有消息都发送出去
                    writer_s.flush();

                    // 查看客户端是否退出
                    if (EXIT.equals(msg)) {
                        System.out.println("客户端[" + socket_s.getPort() + "]已退出");
                        break;
                    }
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 无论正常、异常，关闭 serverSocket
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                    System.out.println("关闭服务器serverSocket");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
