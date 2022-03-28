package work.yukong.suanfa.recursion;

/**
 * @Author 空白
 * @Date 2022/3/27 23:39
 * @Version 1.0
 */
public class Queen8 {
    static int max = 8;
    static int[] array = new int[max];
    static int count = 0;
    public static void main(String[] args) {
        cheek(0);
        System.out.println(count);

    }
    //判断是否冲突
    public static boolean conflict(int n){
        for (int i = 0; i < n; i++) {
            //array[i] == array[n] 说明第n个皇后和前面的皇后在同一列
            // Math.abs(i-n) == Math.abs(array[i] - array[n])说明这两个皇后斜率相同在同一条斜线上
            if (array[i] == array[n] || Math.abs(i-n) == Math.abs(array[i] - array[n])){
                return false;
            }
        }
        return true;
    }
    //摆放第n个皇后
    public static void cheek(int n){
        //如果n等于8相当于摆放完成了一盘，进行打印
        if (n == max) {
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            //将第n个皇后摆放在第i个位置
            array[n] = i;
            //如果n和之前的皇后不冲动则直接递归调用，如果冲突，会跑完剩余的循环进行判断是否冲突，跑完循环还是冲突的话，就会回溯到上一个皇后更改位置，继续摆放
            //每次完一个棋盘就会向上回溯，不满足条件继续回溯
            if (conflict(n)) {
                cheek(n+1);
            }
        }

    }
    public static void print(){
        count++;
        for (int i = 0; i < max; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
