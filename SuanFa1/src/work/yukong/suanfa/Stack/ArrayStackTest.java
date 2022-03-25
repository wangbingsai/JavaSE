package work.yukong.suanfa.Stack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author 空白
 * @Date 2022/3/22 22:14
 * @Version 1.0
 */
public class ArrayStackTest {
    public static void main(String[] args) {
        String key = " ";
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        ArrayStack stack = new ArrayStack(5);
        while (flag) {
            System.out.println("pop出栈");
            System.out.println("push入栈");
            System.out.println("show展示栈");
            System.out.println("exit退出");
            key = scanner.next();
            switch (key) {
                case "pop":
                    try {
                        System.out.println(stack.pop());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "push":
                    System.out.println("请输入压栈数据");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case "show":
                    stack.showList();
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序结束！");
    }
}
