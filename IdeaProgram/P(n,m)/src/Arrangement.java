import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrangement {
    public static void main(String[] args) {
        int pnm = 0;
        factorial n = new factorial();      //声明n，且为n分配空间
        factorial nsubtm = new factorial();
        System.out.println("Input the 'n' of P(n,m):");
        scan nread = new scan();        //声明nread，且为nread分配空间
        nread.get();        //实现屏幕输入
        System.out.println("Input the 'm' of P(n,m):");
        scan mread = new scan();
        mread.get();
        n.mult(nread.getin);      //调用方法mult，实现阶乘运算
        //m.mult(mread);      //m!
        nsubtm.mult(nread.getin - mread.getin);       //(n-m)!
        if (n.choice==1 || nsubtm.choice==1)        //借用choice判断阶乘的结果是否超过了int类型的容量
        {
            System.out.println("The count of n.supnum passes the capacity of 'int' !");
            System.exit(0);         //如果超过int容量，结束进程
        }
        else {          //如果没超过，进行运算
            if (n.supnum == 0 || nsubtm.supnum == 0) {
                System.out.println("Error!");
            } else {
                //System.out.println("n.supnum"+n.supnum);
                //System.out.println("nsubtm.supnum"+nsubtm.supnum);
                pnm = n.supnum / nsubtm.supnum;
                System.out.println("Ihe result of P(n,m) is:" + pnm);       //输出结果
            }
        }
    }
}