import org.apache.commons.codec.binary.Base64;

import java.io.*;
import java.net.*;
import java.util.Map;

public class ServerDH {
    public static void main(String args[]) {
        String miwen, temp, answer;
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
            // in读取信息，堵塞状态，111111
            miwen = in.readUTF ( );
            System.out.println ("服务器收到客户的密文:\n" + miwen);

            //由甲方的公钥产生的密钥对
            // in读取信息，堵塞状态，2222222
            String tempKey1 = in.readUTF ();
            System.out.println ("server one error" );
            byte [] publicKey1 = tempKey1.getBytes ();
            System.out.println("甲方公钥：/n"+Base64.encodeBase64String(publicKey1));
            Map<String,Object> keyMap2=DH.initKey(publicKey1);
            byte[] publicKey2=DH.getPublicKey(keyMap2);
            byte[] privateKey2=DH.getPrivateKey(keyMap2);
            System.out.println("乙方公钥：/n"+Base64.encodeBase64String(publicKey2));
            System.out.println("乙方私钥：/n"+Base64.encodeBase64String(privateKey2));



            String AES_key = "20175223yaomingyushidashuaibi111";
            String mingwen = AES.dcodes(miwen, AES_key);
            temp = MyBC.toSuffix (mingwen);
            System.out.println ("服务器将中缀表达式变形为后缀表达式:\n" +temp);
            //out发送信息，111111
            out.writeUTF (temp);
            answer = String.valueOf(mydc.evaluate(temp));
            //out发送信息，222222
            out.writeUTF (answer);
            Thread.sleep (500);
        } catch (Exception e) {
            System.out.println ("客户已断开" + e);
        }
    }
}