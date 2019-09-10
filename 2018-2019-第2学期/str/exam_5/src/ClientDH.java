import org.apache.commons.codec.binary.Base64;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;

public class ClientDH {
    public static void main(String args[]) {
        String cipherText, plainText, answer;
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

            //设立AES算法的32字符密钥，输入密文与密钥
            String AES_Key = "20175223yaomingyushidashuaibi111";
            //将中缀表达式变形为后缀表达式
            plainText = MyBC.toSuffix (str);
            System.out.println ("后缀表达式明文:\n" + plainText);

            //将后缀表达式明文通过AES加密，并将后缀表达式密文发往客户端
            cipherText = AES.ecodes (plainText, AES_Key);
            System.out.println ("后缀表达式密文:\n" + cipherText + "\n");
            //out发送信息
            out.writeUTF (cipherText);

            //对AES算法的32字符密钥进行DH算法加密
            //生成客户端的密钥对
            Map <String, Object> keyMap1 = DH.initKey ( );
            //客户端的公钥
            byte[] publicKey1 = DH.getPublicKey (keyMap1);
            //客户端的私钥
            byte[] privateKey1 = DH.getPrivateKey (keyMap1);
            System.out.println ("客户端公钥：/n" + Base64.encodeBase64String (publicKey1));
            System.out.println ("客户端私钥：/n" + Base64.encodeBase64String (privateKey1));
            String tempKey1 = Base64.encodeBase64String (publicKey1);
            //out发送信息
            out.writeUTF (tempKey1);

            //组装客户端的本地加密密钥,由服务器的公钥和客户端的私钥组合而成
            //in读取信息，堵塞状态
            String tempKey2 = in.readUTF ( );
            byte[] publicKey2 = Base64.decodeBase64 (tempKey2);
            System.out.println ("服务器公钥：/n" + Base64.encodeBase64String (publicKey1));
            byte[] key1 = DH.getSecretKey (publicKey2, privateKey1);
            System.out.println ("客户端的本地密钥：/n" + Base64.encodeBase64String (key1));

            //客户端使用本地密钥对AES_Key进行消息加密，并发给服务器
            byte[] code1 = DH.encrypt (AES_Key.getBytes ( ), key1);
            System.out.println ("客户端使用本地密钥对AES_Key进行加密后的数据：" + Base64.encodeBase64String (code1));
            //out发送信息，333333
            out.writeUTF (Base64.encodeBase64String (code1));

            //接受服务器的计算结果
            answer = in.readUTF ( );
            System.out.println ("\n**计算由服务器进行**\n\n客户收到服务器的计算结果:\n" + answer);
            Thread.sleep (500);
        } catch (Exception e) {
            System.out.println ("服务器已断开" + e);
        }
    }
}