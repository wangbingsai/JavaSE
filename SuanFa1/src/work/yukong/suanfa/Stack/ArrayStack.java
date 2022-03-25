package work.yukong.suanfa.Stack;

/**
 * @Author 空白
 * @Date 2022/3/22 21:58
 * @Version 1.0
 */
public class ArrayStack {
    //最大容量
    private int maxSize;
    //数组模拟栈
    private int[] array;
    //栈顶
    private int top = -1;

    //构造器
    public ArrayStack(int maxSize) {
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

}

