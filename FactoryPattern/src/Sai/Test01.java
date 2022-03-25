package Sai;

/**
 * @Author 空白
 * @Date 2021/9/24 12:56
 * @Version 1.0
 */
public class Test01 {
    private String[] data = {"10","10.5"};
    public void fun(){
        double s = 0;
        for (int i = 0; i < 3; i++) {
            try {
                s = s+Integer.parseInt(data[i]);
            }catch (Exception e){
                System.out.println("errorl:"+data[i]);
            }

        }
    }

    public static void main(String[] args) {
        try {
            Test01 test01 = new Test01();
            test01.fun();
        }catch (Exception e){
            System.out.println("error2");
        }

    }
}
