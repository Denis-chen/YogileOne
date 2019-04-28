import java.io.*;

public class exp10_20 {

   public static void main(String args[]) {

      StandardExam exam = new StandardExam();

      File f = new File("test.txt");

      exam.setTestFile(f); 

      exam.startExamine();

   }

} 
