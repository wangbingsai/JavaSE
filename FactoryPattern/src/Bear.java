import java.util.Scanner;

/**
 * @Author 空白
 * @Date 2021/8/11 14:49
 * @Version 1.0
 */
public class Bear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("买多少钱");
        int money = s.nextInt();

        System.out.println("喝"+beerNumb(money,0)+"瓶");

        }
        public static int beerNumb(int money ,int ping){
          //买换啤酒数
            int beerNumber=money/2+ping/4;
            //瓶子数
            ping=beerNumber+ping%4;
            if(ping>=4){
                beerNumber+=beerNumb(0, ping);
            }
            return beerNumber;

        }



}

