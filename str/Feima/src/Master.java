import java.util.Scanner;

public class Master {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("输入奇整数 n（n>=3）：");
        int number = reader.nextInt();
        System.out.println("输入安全参数 t：");
        int t = reader.nextInt();
        int max=number-1;
        int min=2;
        int r=0;
        for (int j=0,count=0; count<t; j++,count++) {
            int b = (int)(1+Math.random()*(max-min+1));
            System.out.println("bbbbbbbbb:"+b);
            int moddle = b;
            for (int i=0; i<number-2; i++) {
                moddle = moddle*b;
                r = moddle%number;
            }
            System.out.println("mmmm:"+moddle);
            System.out.println("rrrrrr:"+r);

            if (r!=1) {
                System.out.println("n为合数。");
                j=-2;
                return;
            }
            else if (r==1) {
                System.out.println("n为素数。");
            }
            else {
                ;
            }
        }
    }
}



