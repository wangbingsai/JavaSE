package work.yukong.suanfa;

/**
 * @Author 空白
 * @Date 2021/10/26 13:55
 * @Version 1.0
 */
public class ReString {
    public static void main(String[] args) {
        rePrint("I am Student!");
    }
    public static void rePrint(String str){
        for (int i = str.length() - 1; i >=0; i--) {
            char c = str.charAt(i);
            String s = "";
            s+=c;
            System.out.print(s);
        }
    }


}
