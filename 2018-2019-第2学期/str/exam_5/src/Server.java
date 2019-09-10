import java.io.*;
import java.net.*;

public class Server {
    public static void main(String args[]) {
        String question, temp, answer;
        MyDC mydc = new MyDC ();
        ServerSocket serverForClient = null;
        Socket socketOnServer = null;
        DataOutputStream out = null;
        DataInputStream in = null;
        try {
            serverForClient = new ServerSocket (2010);
        } catch (IOException e1) {
            System.out.println (e1);
        }
        try {
            System.out.println ("等待客户呼叫");
            //堵塞状态，除非有客户呼叫
            socketOnServer = serverForClient.accept ( );
            out = new DataOutputStream (socketOnServer.getOutputStream ( ));
            in = new DataInputStream (socketOnServer.getInputStream ( ));
            // in读取信息，堵塞状态
            question = in.readUTF ( );
            System.out.println ("服务器收到客户的中缀表达式:\n" + question);
            temp = MyBC.toSuffix (question);
            System.out.println ("服务器将中缀表达式变形为后缀表达式:\n" +temp);
            out.writeUTF (temp);
            answer = String.valueOf(mydc.evaluate(temp));
            out.writeUTF (answer);
            Thread.sleep (500);
        } catch (Exception e) {
            System.out.println ("客户已断开" + e);
        }
    }
}