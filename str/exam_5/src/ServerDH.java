import org.apache.commons.codec.binary.Base64;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

public class ServerDH {
    public static void main(String args[]) {
        String cipherText, plainText, answer;
        MyDC mydc = new MyDC ( );
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
            cipherText = in.readUTF ( );
            System.out.println ("服务器收到客户的后缀表达式密文:\n" + cipherText + "\n");


            //由甲方的公钥产生的密钥对
            // in读取信息，堵塞状态，2222222
            String tempKey1 = in.readUTF ( );
            byte[] publicKey1 = Base64.decodeBase64 (tempKey1);
            System.out.println ("甲方公钥：/n" + Base64.encodeBase64String (publicKey1));
            Map <String, Object> keyMap2 = DH.initKey (publicKey1);
            byte[] publicKey2 = DH.getPublicKey (keyMap2);
            byte[] privateKey2 = DH.getPrivateKey (keyMap2);
            System.out.println ("乙方公钥：/n" + Base64.encodeBase64String (publicKey2));
            System.out.println ("乙方私钥：/n" + Base64.encodeBase64String (privateKey2));

            //为组装甲方的本地加密密钥,将乙方的公钥发给甲方
            String tempKey2 = Base64.encodeBase64String (publicKey2);
            //out发送信息，333333
            out.writeUTF (tempKey2);

            //组装乙方的本地加密密钥，由甲方的公钥和乙方的私钥组合而成
            byte[] key2 = DH.getSecretKey (publicKey1, privateKey2);
            System.out.println ("乙方的本地密钥：/n" + Base64.encodeBase64String (key2));

            //接受甲方的AES_Key的加密信息，对其解密
            byte[] code1 = Base64.decodeBase64 (in.readUTF ( ));
            byte[] decode1 = DH.decrypt (code1, key2);
            String AES_Key = new String (decode1);
            System.out.println ("\n乙方解密后的AES_Key数据：" + AES_Key);

            //使用解密后的AES_Key对后缀表达式密文解密，并算出结果
            plainText = AES.dcodes (cipherText, AES_Key);
            System.out.println ("\nAES_Key对后缀表达式密文解密:\n" + plainText);
            answer = String.valueOf (mydc.evaluate (plainText));

            //将计算结果发给甲方
            out.writeUTF (answer);
            System.out.println ("\n**结果由客户端进行输出**" );
            Thread.sleep (500);
        } catch (Exception e) {
            System.out.println ("客户已断开" + e);
        }
    }
}