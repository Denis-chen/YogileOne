import java.util.Scanner;

public class MyBCTest {
    public static void main(String[] args) {
        MyBC mybc = new MyBC ();
        MyDC mydc = new MyDC ();
        String inExpression;
        String str;
        Scanner reader = new Scanner (System.in);
        System.out.println ("Enter a expression: ");
        inExpression = reader.nextLine ();
        str = mybc.toSuffix (inExpression);
        System.out.println ("Exchange the expression by MyBC: " +str);
        System.out.println ("The calculation result of MyDC: " +mydc.evaluate(str));
    }
}