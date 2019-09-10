import java.util.Scanner;

public class exp8_8 {

    public static void main(String args[]) {

       String sourceString = "今晚十点进攻";

       EncryptAndDecrypt person = new EncryptAndDecrypt(); 

       System.out.println("输入密码加密:"+sourceString);
       
       String password = "";

       for (int i = 0; i < 8; i++) {
             
            char c = (char) ((Math.random() * 26) + 97);
            
            password += (c + "");
        }

       String secret = person.encrypt(sourceString,password);

       System.out.println("密文:"+secret);


       String source = person.decrypt(secret,password);

       System.out.println("明文:"+source);

    }

}
