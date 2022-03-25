import java.util.Scanner;

/**
 * @Author 空白
 * @Date 2021/12/17 10:33
 * @Version 1.0
 */
public class Size {
    double x;
    double y;
    public Size(double a, double b){
        x=a;
        y=b;
    }
    double jia(){
        return x+y;
    }
    double jian(){
        return x-y;
    }
    double cheng(){
        return x*y;
    }
    double chu(){
        return x/y;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入x:");
        double x=in.nextDouble();
        System.out.print("请输入y:");
        double y=in.nextDouble();
        Size size = new Size(x, y);
        System.out.print("请输入符号：");
        String next = in.next();
        char c = next.charAt(0);
        switch (c){
            case '+':
                System.out.println(size.jia());break;
            case '-':
                System.out.println(size.jian());break;
            case '*':
                System.out.println(size.cheng());break;
            case '/':
                System.out.println(size.chu());break;


        }



    }
}
