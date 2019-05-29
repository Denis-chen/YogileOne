import org.apache.commons.codec.binary.Base64;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Map;

public class ClientDH {
    public static void main(String args[]) {
        //Scanner reader = new Scanner (System.in);
        System.out.println ("客户输入一个中缀表达式: ");
        //String str = reader.nextLine ();
        String str = "1+2";
        Socket mysocket;
        DataInputStream in = null;
        DataOutputStream out = null;
        String tempKey1;
        try {
            mysocket = new Socket ("127.0.0.1", 2010);
            in = new DataInputStream (mysocket.getInputStream ( ));
            out = new DataOutputStream (mysocket.getOutputStream ( ));

            //设立AES算法的32字符密钥，输入密文与密钥
            String AES_key = "20175223yaomingyushidashuaibi111";
            String miwen = AES.ecodes(str,AES_key);
            //将密文发往客户端，out发送信息，111111111
            System.out.println ("客户发往服务器的密文:\n" + miwen);
            out.writeUTF (miwen);

            //对AES算法的32字符密钥进行DH算法加密
            //生成甲方的密钥对
            Map<String,Object> keyMap1=DH.initKey();
            //甲方的公钥
            byte[] publicKey1=DH.getPublicKey(keyMap1);
            //甲方的私钥
            byte[] privateKey1=DH.getPrivateKey(keyMap1);
            System.out.println("甲方公钥：/n"+Base64.encodeBase64String(publicKey1));
            System.out.println("甲方私钥：/n"+Base64.encodeBase64String(privateKey1));
            tempKey1= Base64.encodeBase64String(publicKey1);
            //out发送信息，222222
            out.writeUTF(tempKey1);

            //in读取信息，堵塞状态，1111111
            String temp = in.readUTF ( );
            System.out.println ("客户收到服务器的后缀表达式:\n" + temp);
            //in读取信息，堵塞状态，2222222
            String answer = in.readUTF ( );
            System.out.println ("客户收到服务器的计算结果:\n" + answer);
            Thread.sleep (500);
        } catch (Exception e) {
            System.out.println ("服务器已断开" + e);
        }
    }
}