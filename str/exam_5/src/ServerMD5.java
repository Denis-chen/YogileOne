import org.apache.commons.codec.binary.Base64;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
public class ServerMD5 {
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
            // in读取信息，堵塞状态
            cipherText = in.readUTF ( );
            System.out.println ("服务器收到客户的后缀表达式密文:\n" + cipherText + "\n");


            //由客户端的公钥产生的密钥对
            // in读取信息，堵塞状态
            String tempKey1 = in.readUTF ( );
            byte[] publicKey1 = Base64.decodeBase64 (tempKey1);
            System.out.println ("客户端公钥：/n" + Base64.encodeBase64String (publicKey1));
            Map <String, Object> keyMap2 = DH.initKey (publicKey1);
            byte[] publicKey2 = DH.getPublicKey (keyMap2);
            byte[] privateKey2 = DH.getPrivateKey (keyMap2);
            System.out.println ("服务器公钥：/n" + Base64.encodeBase64String (publicKey2));
            System.out.println ("服务器私钥：/n" + Base64.encodeBase64String (privateKey2));

            //为组装客户端的本地加密密钥,将服务器的公钥发给客户端
            String tempKey2 = Base64.encodeBase64String (publicKey2);
            //out发送信息
            out.writeUTF (tempKey2);

            //组装服务器的本地加密密钥，由客户端的公钥和服务器的私钥组合而成
            byte[] key2 = DH.getSecretKey (publicKey1, privateKey2);
            System.out.println ("服务器的本地密钥：/n" + Base64.encodeBase64String (key2));

            //接受客户端的AES_Key的加密信息，对其解密
            byte[] code1 = Base64.decodeBase64 (in.readUTF ( ));
            byte[] decode1 = DH.decrypt (code1, key2);
            String AES_Key = new String (decode1);
            System.out.println ("\n服务器解密后的AES_Key数据：" + AES_Key);

            //使用解密后的AES_Key对后缀表达式密文解密，并算出结果
            plainText = AES.dcodes (cipherText, AES_Key);
            System.out.println ("\nAES_Key对后缀表达式密文解密:" + plainText);
            answer = String.valueOf (mydc.evaluate (plainText));

            //接受客户端的MD5值，计算解密后后缀表达式的MD5值，并判断是否相同，不同则停止
            String clicetValueMD5 = in.readUTF ();
            String valueMD5 = MD5.numberMD5 (plainText);
            if (!clicetValueMD5.equals (valueMD5)) {
                return;
            }
            System.out.println ("\n服务器MD5值:"+valueMD5 +"\n**与客户端相同**");

            //将计算结果发给客户端
            out.writeUTF (answer);
            System.out.println ("\n**结果由客户端进行输出**" );
            Thread.sleep (500);
        } catch (Exception e) {
            System.out.println ("客户已断开" + e);
        }
    }
}