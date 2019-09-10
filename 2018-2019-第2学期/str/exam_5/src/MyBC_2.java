public class MyBC_2 {
    private Stack theStack;
    private String input;
    private String output = "";

    public MyBC_2 () {
    }

    public MyBC_2(String in) {
        input = in;
        int stackSize = input.length ( );
        theStack = new Stack (stackSize);
    }

    public String doTrans() {
        for (int j = 0; j < input.length ( ); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+':
                case '-':
                    gotOper (ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper (ch, 2);
                    break;
                case '(':
                    theStack.push (ch);
                    break;
                case ')':
                    gotParen (ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while (!theStack.empty ( )) {
            output = output + theStack.pop ( );
        }
        return output;
    }

    public void gotOper(char opThis, int prec1) {
        while (!theStack.empty ( )) {
            char opTop = theStack.pop ( );
            if (opTop == '(') {
                theStack.push (opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }
                if (prec2 < prec1) {
                    theStack.push (opTop);
                    break;
                } else {
                    output = output + opTop;
                }

            }
        }
        theStack.push (opThis);
    }

    public void gotParen(char ch) {
        while (!theStack.empty ( )) {
            char chx = theStack.pop ( );
            if (chx == '(') {
                break;
            } else {
                output = output + chx;
            }
        }
    }

    class Stack {
        private int maxSize;
        private char[] stackArray;
        private int top;

        public Stack(int max) {
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }

        public void push(char j) {
            stackArray[++top] = j;
        }

        public char pop() {
            return stackArray[top--];
        }

        public char peek() {
            return stackArray[top];
        }

        public boolean empty() {
            return (top == -1);
        }
    }
}
