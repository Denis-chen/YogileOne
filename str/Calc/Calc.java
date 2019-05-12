/**
 * @author 10542
 */
public class Calc {
    public static void main(String[] args) {
        int result = 0;

        if (args.length != 3) {
            System.out.println ("Usage: java Calc operato1 operand(+ - x / %) operator2");
            System.exit (0);
        }

        int [] number = new int[]{Integer.parseInt(args[0]), Integer.parseInt(args[2])};
        switch (args[1]) {
            case "+":
                result = number[0] + number[1];
                break;
            case "-":
                result =  number[0] - number[1];
                break;
            case "x":
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
        System.out.println (args[0] + " " + args[1] + " " + args[2] + " = " + result);

    }
}
