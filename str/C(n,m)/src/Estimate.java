public class Estimate {             //执行主要的判断
    void estimate(int n, int m) {
        int result;
        if (n<m && n>=0 && m>=0) {
            System.out.println("Error: m is bigger than n!");
        }
        else if (n>=m && n>=0 && m<0) {
            System.out.println("Error: m is smaller than 0!");
        }
        else if (n>=m && n<0 && m<0) {
            System.out.println("Error: both n and m is smaller than 0!");
        }
        else if (n>=m && n>=0 && m>=0) {
            Recursion recu = new Recursion();           //创建 Recursion 类的对象
            result=recu.recursion(n, m);            //执行递归程序，并赋值给 result
            System.out.println(result);             //输出计算结果
        }
        else {
            System.out.println("Error: unknown!");
        }
    }
}

