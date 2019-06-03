import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;
//(20)-(17)/4+(52)-(23)*2
public class Client {
    public static void main(String args[]) {
        Scanner reader = new Scanner (System.in);
        System.out.println ("客户输入一个中缀表达式: ");
        String str = reader.nextLine ();
        Socket mysocket;
        DataInputStream in = null;
        DataOutputStream out = null;
        try {
            mysocket = new Socket ("127.0.0.1", 2010);
            in = new DataInputStream (mysocket.getInputStream ( ));
            out = new DataOutputStream (mysocket.getOutputStream ( ));
            out.writeUTF (str);
            in.readUTF();
            Thread.sleep (500);
        } catch (Exception e) {
            System.out.println ("服务器已断开" + e);
        }
    }
}