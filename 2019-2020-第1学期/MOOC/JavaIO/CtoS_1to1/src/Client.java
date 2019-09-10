import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {

        final String DEFAULT_SERVER_HOST = "127.0.0.1";
        final int DEFAULT_SERVER_PORT = 8888;
        final String EXIT = "exit";
        Socket socket_c = null;
        BufferedWriter writer_c =null;

        try {
            // 创建socket,与服务器建立连接
            socket_c = new Socket(DEFAULT_SERVER_HOST,DEFAULT_SERVER_PORT);

            // 创建IO流
            BufferedReader reader_c = new BufferedReader(
                    new InputStreamReader(socket_c.getInputStream())
            );
            writer_c = new BufferedWriter(
                    new OutputStreamWriter(socket_c.getOutputStream())
            );

            // 等待用户输入信息
            System.out.println("输入信息(exit退出)：");
            BufferedReader consoleReader = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            while (true) {
                String input = consoleReader.readLine();

                // 发送信息给服务器
                writer_c.write(input + "\n");
                writer_c.flush();

                // 读取服务器返回消息
                String msg = reader_c.readLine();
                System.out.println(msg);

                // 检查用户是否退出
                if (EXIT.equals(input)) {
                    System.out.println("客户端已退出");
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer_c != null) {
                try {
                    writer_c.close();
                    System.out.println("关闭客户端socket");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
