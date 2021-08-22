public class JieCheng {
    public static void main(String[] args) {
        long cheng = cheng(20);
        System.out.println(cheng);
    }
    public static long cheng(long a){
        if(a==1){
            return 1;
        }
        return a*=cheng(a-1);
    }
}
