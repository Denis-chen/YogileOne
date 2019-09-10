public class Combination {
    public static void main(String[] args) {
        int n=0, m=0;
        if (args.length == 2) {             //判断命令行输入参数的格式是否正确
            n = Integer.parseInt(args[0]);             //将命令行参数中的 String 型转化为 int 型，并赋值给 n 、 m
            m = Integer.parseInt(args[1]);
        }
        else {
            System.out.println("Input args Error!");
            System.exit(0);
        }
        Estimate esti = new Estimate();
        esti.estimate(n, m);
    }
}

