import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrangement {
    public static void main(String[] args) {
        double pnm = 0, intcount=0;
        System.out.println(intcount);
        factorial n = new factorial();
        factorial nsubtm = new factorial();
        /*Scanner readin1 = new Scanner(System.in);
        System.out.println("Input the 'n' of P(n,m):");
        int nread = readin1.nextInt();
        Scanner readin2 = new Scanner(System.in);
        System.out.println("Input the 'm' of P(n,m):");
        int mread = readin2.nextInt();*/
        //int numberOfDigits = String.valueOf(intcount).length();
        for(int mread=1; mread <= 12; mread++)
        {
            for (int nread=1;(nread >= mread) && (nread <= 12); nread++)
            {
                n.mult(nread);      //n!
                nsubtm.mult(nread - mread);       //(n-m)!

                if(n.supnum==0 || nsubtm.supnum==0)
                {
                    System.out.println("nread="+nread+" mread="+mread+"  Error!");
                }
                else {
                    pnm = n.supnum / nsubtm.supnum;
                    System.out.println("nread="+nread+" mread="+mread);
                    System.out.println("Ihe result of P(n,m) is:" + pnm);
                }
            }
        }
        n.mult(28);
        System.out.println(n.supnum);
        /*
        n.mult(nread);      //n!
        nsubtm.mult(nread - mread);       //(n-m)!

        if(n.supnum==0 || nsubtm.supnum==0)
        {
            System.out.println("Error!");
        }
        else {
            pnm = n.supnum / nsubtm.supnum;
            System.out.println("Ihe result of P(n,m) is:" + pnm);
        }*/
    }
}


//m.mult(mread);      //m!
//System.out.println("n.supnum"+n.supnum);
//System.out.println("nsubtm.supnum"+nsubtm.supnum);