import java.util.Scanner;

public class MyBCTest {
    public static void main(String[] args) {
        MyBC mybc = new MyBC ();
        MyDC mydc = new MyDC ();
        String inExpression;
        String str2;
        Scanner reader = new Scanner (System.in);
        System.out.println ("IEnter a expression: ");
        inExpression = reader.nextLine ();
        str2 = mybc.toSuffix (inExpression);
        System.out.println ("str2: " +str2);
        System.out.println ("result: " +mydc.evaluate(str2));
    }
}