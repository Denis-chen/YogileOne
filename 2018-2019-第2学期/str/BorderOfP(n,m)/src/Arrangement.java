import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrangement {
    public static void main(String[] args) {
        int pnm = 0;
        factorial n = new factorial();
        factorial nsubtm = new factorial();
        for(int mread=1; mread <= 12; mread++)
        {
            for (int nread=mread;(nread >= mread) && (nread <= 12); nread++)
            {
                n.mult(nread);      //n!
                nsubtm.mult(nread - mread);       //(n-m)!
                if(n.supnum==0 || nsubtm.supnum==0)
                {
                    System.out.println("nread="+nread+" mread="+mread+"  Error!");
                }
                else {
                    pnm = n.supnum / nsubtm.supnum;
                    System.out.println("nread="+nread+" mread="+mread+"\nn.supnum="+n.supnum+" nsubtm.supnum="+nsubtm.supnum);
                    System.out.println("Ihe result of P(n,m) is:" + pnm+"\n");
                }
            }
        }
        n.mult(28);
        System.out.println(n.supnum);
    }
}
