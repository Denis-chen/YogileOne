/**
 * @author 10542
 */
public class Calc {
    public static void main(String[] args) {
        int result = 0;
        //判断命令行参数的长度，若长度不等于3，则错误，程序结束
        if (args.length != 3) {
            System.out.println ("Usage: java Calc operato1 operand(+ - * / %) operator2");
            System.exit (0);
        }
        //定义number[2]，将命令行参数数据类型改变，并传入数组
        int [] number = new int[]{Integer.parseInt(args[0]), Integer.parseInt(args[2])};
        //通过switch选择语句，判断命令行参数args[1]的字符，并进行相应运算
        switch (args[1]) {
            case "+":
                result = number[0] + number[1];
                break;
            case "-":
                result =  number[0] - number[1];
                break;
            case "*":
                result =  number[0] * number[1];
                break;
            case "/":
                if (number[1]==0) {
                    System.out.println ("Error: The divisor is 0.");
                    System.exit (0);
                }
                result =  number[0] / number[1];
                break;
            case "%":
                if (number[1]==0) {
                    System.out.println ("Error: The divisor is 0.");
                    System.exit (0);
                }
                result =  number[0] % number[1];
                break;
                default:
                    System.out.println ("Error: switch part is wrong." );
        }
        //按格式输出
        System.out.println (args[0] + " " + args[1] + " " + args[2] + " = " + result);

    }
}