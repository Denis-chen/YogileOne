import java.io.*;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;
public class SDec{
    public static void main(String args[]) throws Exception{
        // 获取密文
        FileInputStream f=new FileInputStream("SEnc.dat");
        int num=f.available();
        byte[ ] ctext=new byte[num];
        f.read(ctext);
        // 获取密钥
        FileInputStream  f2=new FileInputStream("keykb1.dat");
        int num2=f2.available();
        byte[ ] keykb=new byte[num2];
        f2.read(keykb);
        SecretKeySpec k=new  SecretKeySpec(keykb,"DESede");
        // 解密
        Cipher cp=Cipher.getInstance("DESede");
        cp.init(Cipher.DECRYPT_MODE, k);
        byte []ptext=cp.doFinal(ctext);
        // 显示明文
        String p=new String(ptext,"UTF8");
        System.out.println(p);
    }
}