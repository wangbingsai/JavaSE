package work.yukong.suanfa.Queue;

import java.util.Scanner;

/**
 * @Author 空白
 * @Date 2022/3/14 21:56
 * @Version 1.0
 */
public class TestQueueArray {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(3);
        Scanner scanner = new Scanner(System.in);
        char key = ' ';
        boolean flag = true;
        while (flag) {
            System.out.println("a（add）:添加数据");
            System.out.println("g（get）:取出数据");
            System.out.println("s（show）:展示数据");
            System.out.println("e（exit）:退出程序");
            System.out.println("h（head）:展示头数据");
            key = scanner.next().charAt(0);
            switch (key) {
                case 'a' :
                    System.out.println("请输入数据");
                    queue.add(scanner.nextInt());
                    break;
                case  'g' :
                    try {
                        System.out.printf("取出的数据为：%d\n",queue.get());
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 's':
                    queue.show();
                    break;
                case 'h':
                    try {
                        System.out.printf("头数据为：%d\n",queue.head());
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                   flag = false;
                   break;
                default:
                    System.out.println("输入有误请重新输入");
                    break;
            }
        }

    }
}
