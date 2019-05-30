import java.security.MessageDigest;

public class MD5 {
    public static String numberMD5(String plainText) throws Exception {
        String x = plainText;
        MessageDigest m = MessageDigest.getInstance ("MD5");
        m.update (x.getBytes ("UTF8"));
        byte s[] = m.digest ( );
        String result = "";
        for (int i = 0; i < s.length; i++) {
            result += Integer.toHexString ((0x000000ff & s[i]) | 0xffffff00).substring (6);
        }

        return result;
    }

    public static void main(String[] args) {
        //MD5 md5 = new MD5 ();
        try {
            String test = MD5.numberMD5 ("123");
            System.out.println ("test:" + test);
        } catch (Exception e) {
            e.printStackTrace ( );
        }
    }
}