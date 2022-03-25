package work.yukong.suanfa.Stack.JiSuanQi;

/**
 * @Author 空白
 * @Date 2022/3/25 20:39
 * @Version 1.0
 */

public class Culcalator {
    public static void main(String[] args) {
        ArrayStack3 operStack = new ArrayStack3(20);
        ArrayStack2 numStack = new ArrayStack2(20);
        String ch = "2.56*3.1*6-3+4/4";
        String keepNum = "";
        int index = 0;
        boolean flag = true;
        while (flag) {
            char key = ch.substring(index, index + 1).charAt(0);
            //如果这个字符不是符号就如数字栈
            if (!operStack.isOper(key)) {
                //判断是否为多位数，如果是多位数进行字符拼接
                keepNum += key;
                //如果这个字符是最后一位直接入数字栈
                if (index == ch.length() - 1) {
                    numStack.push(Double.parseDouble(keepNum));
                    //如果这个字符后面是字符则直接将这个字符串转换成int型数字入数字栈
                } else if (operStack.isOper(ch.substring(index + 1, index + 2).charAt(0))) {
                    numStack.push(Double.parseDouble(keepNum));
                    keepNum = "";
                }
            } else {
                //如果这个字符是符号且现在的符号栈不为空，直接入符号栈
                if (operStack.isEmpty()) {
                    operStack.push(key);
                } else {
                    //如果符号栈不为空先判断当前符号和符号栈中的符号优先级，如果当前符号优先级小于等于符号栈中的优先级，
                    // pop出数字栈中的两个数字和符号栈汇总的一个符号进行运算，将运算结果入数字栈
                    if (operStack.priority(operStack.show()) >= operStack.priority(key)) {
                        double num1 = numStack.pop();
                        double num2 = numStack.pop();
                        int oper = operStack.pop();
                        double res = numStack.cal(num1, num2, oper);
                        numStack.push(res);
                        operStack.push(key);
                    } else {
                        operStack.push(key);
                    }
                }
            }

            index++;
            if (index == ch.length()) {
                break;
            }
        }
        //计算栈中的数字
        while (true) {
            //如果符号栈为空则直接结束
            if (operStack.isEmpty()) {
                break;
            }
            double num1 = numStack.pop();
            double num2 = numStack.pop();
            int oper = operStack.pop();
            double res = numStack.cal(num1, num2, oper);
            numStack.push(res);
        }
        System.out.printf("%s=%.4f", ch, numStack.show());
    }

}

class ArrayStack2 {
    //最大容量
    private int maxSize;
    //数组模拟栈
    private double[] array;
    //栈顶
    private int top = -1;

    //构造器
    public ArrayStack2(int maxSize) {
        this.maxSize = maxSize;
        array = new double[this.maxSize];
    }

    //判断栈是否空
    public boolean isEmpty() {
        return top == -1;
    }

    //判断栈是否满
    public boolean isFull() {
        return top == maxSize - 1;
    }

    //入栈
    public void push(double value) {
        if (isFull()) {
            System.out.println("栈已满！！");
            return;
        }
        //数据入栈，top指针后移
        array[++top] = value;
    }

    //出栈
    public double pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空，出栈失败！");
        }
        return array[top--];
    }

    //展示栈数据
    public void showList() {
        if (isEmpty()) {
            System.out.println("栈空！");
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d] = %d\n", i, array[i]);
        }
    }

    //计算的方法
    public double cal(double num1, double num2, int oper) {
        switch (oper) {
            case '+':
                return num1 + num2;
            case '-':
                return num2 - num1;
            case '*':
                return num1 * num2;
            case '/':
                return num2 / num1;
            default:
                throw new RuntimeException("运算错误！");
        }
    }

    //展示符号栈顶元素
    public double show() {
        return array[top];
    }

}
class ArrayStack3 {
    //最大容量
    private int maxSize;
    //数组模拟栈
    private int[] array;
    //栈顶
    private int top = -1;

    //构造器
    public ArrayStack3(int maxSize) {
        this.maxSize = maxSize;
        array = new int[this.maxSize];
    }

    //判断栈是否空
    public boolean isEmpty() {
        return top == -1;
    }

    //判断栈是否满
    public boolean isFull() {
        return top == maxSize - 1;
    }

    //入栈
    public void push(int value) {
        if (isFull()) {
            System.out.println("栈已满！！");
            return;
        }
        //数据入栈，top指针后移
        array[++top] = value;
    }

    //出栈
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空，出栈失败！");
        }
        return array[top--];
    }

    //展示栈数据
    public void showList() {
        if (isEmpty()) {
            System.out.println("栈空！");
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d] = %d\n", i, array[i]);
        }
    }

    //判断符号优先级，优先级越高返回数字越大
    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            throw new RuntimeException("符号有误");
        }
    }

    //判断是否是运算符
    public boolean isOper(int oper) {
        return oper == '*' || oper == '/' || oper == '+' || oper == '-';
    }

    //展示符号栈顶元素
    public int show() {
        return array[top];
    }

}
