import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientAES {
    public static void main(String args[]) {
        Scanner reader = new Scanner (System.in);
        System.out.println ("客户输入一个中缀表达式: ");
        String str = reader.nextLine ( );
        Socket mysocket;
        DataInputStream in = null;
        DataOutputStream out = null;
        try {
            mysocket = new Socket ("127.0.0.1", 2010);
            in = new DataInputStream (mysocket.getInputStream ( ));
            out = new DataOutputStream (mysocket.getOutputStream ( ));
            String key = "20175223yaomingyushidashuaibi111";
            //将中缀表达式变形为后缀表达式
            String temp = MyBC.toSuffix (str);
            System.out.println ("服务器将中缀表达式变形为后缀表达式:\n" + temp);
            //输入密文，32字符密钥
            String miwen = AES.ecodes (temp, key);
            System.out.println ("客户发往服务器的密文:\n" + miwen + "\n");
            out.writeUTF (miwen);
            //in读取信息，堵塞状态
            String answer = in.readUTF ( );
            System.out.println ("客户收到服务器的计算结果:\n" + answer);
            Thread.sleep (500);
        } catch (Exception e) {
            System.out.println ("服务器已断开" + e);
        }
    }
}