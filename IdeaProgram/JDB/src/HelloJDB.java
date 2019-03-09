public class HelloJDB{
    public static void main(String[] args) {
        int numone=9, numtwo=10;
        HE tet = new HE();      //为tet分配空间
        tet.mult(numone);       //实现9!并输出
        System.out.println(numone+"!的值supnum="+tet.supnum);
        tet.mult(numtwo);       //实现10!并输出
        System.out.println(numtwo+"!的值supnum="+tet.supnum);
    }
}

class HE{
    int supnum = 1;
    void mult(int  num){
        int innum=1;
        for (int i=1; i<=num; i++){
            innum = innum*i;      //进行阶乘运算
        }
        supnum = innum;
    }
}