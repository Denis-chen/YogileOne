import java.io.*;

public class exp10_19 {

   public static void main(String args[]) {

      File file=new File("Example12_15.java");

      WindowFileLock win=new WindowFileLock(file);

      win.setTitle("使用文件锁");

   }

}
