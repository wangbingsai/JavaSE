package work.yukong.suanfa;

/**
 * @Author 空白
 * @Date 2021/11/14 21:46
 * @Version 1.0
 */
public class DoubleZhiZHen {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        DoubleZhiZHen doubleZhiZHen = new DoubleZhiZHen();
        int[] ints = doubleZhiZHen.twoSum(arr, 9);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
//        boolean b = doubleZhiZHen.judgeSquareSum(4);
//        System.out.println(b);
    }
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null) return null;
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{numbers[i], numbers[j]};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
    public boolean judgeSquareSum(int target) {
        if (target < 0) return false;
        int i = 0, j = (int) Math.sqrt(target);
        System.out.println("j-》"+j);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == target) {
                System.out.println(i);
                System.out.println(j);
                return true;
            } else if (powSum > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
