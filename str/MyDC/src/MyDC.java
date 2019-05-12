import java.lang.String;
import java.util.StringTokenizer;
import java.util.Stack;

/**
 * @author 10542
 */

public class MyDC {
    /**
     * constant for addition symbol
     */
    private final char ADD = '+';
    /**
     * constant for subtraction symbol
     */
    private final char SUBTRACT = '-';
    /**
     * constant for multiplication symbol
     */
    private final char MULTIPLY = '*';
    /**
     * constant for division symbol
     */
    private final char DIVIDE = '/';

    /**
     * the stack
     */
    private Stack<Integer> stack;

    public MyDC() {
        stack = new Stack<Integer>();
    }

    public int evaluate(String expr) {
        int op1, op2, result = 0;
        String token;
        StringTokenizer tokenizer = new StringTokenizer(expr);

        while (tokenizer.hasMoreTokens()) {
            token = tokenizer.nextToken();
            //如果是运算符，调用isOperator
            if (isOperator(token)==true) {
                op2=stack.pop();
                op1=stack.pop();
                //从栈中弹出操作数2
                //从栈中弹出操作数1
                result=evalSingleOp(token.charAt(0),op1,op2);
                //根据运算符和两个操作数调用evalSingleOp计算result;
                stack.push(result);
                //计算result入栈;
            }
            else//如果是操作数
            {
                stack.push(Integer.parseInt(token));
            }
            //操作数入栈;
        }

        return result;
    }

    private boolean isOperator(String token) {
        return (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/"));
    }

    private int evalSingleOp(char operation, int op1, int op2) {
        int result=0;

        switch (operation) {
            case ADD:
                result = op1 + op2;
                break;
            case SUBTRACT:
                result = op1 - op2;
                break;
            case MULTIPLY:
                result = op1 * op2;
                break;
            case DIVIDE:
                result = op1 / op2;
                break;
            default:return 0;
        }
        return result;
    }
}