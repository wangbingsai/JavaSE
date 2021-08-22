/**
 * @Author 空白
 * @Date 2021/8/19 21:46
 * @Version 1.0
 */
public class XuanZePaixu {
    public static void main(String[] args) {
       int [] arr={9,5,4,8,7,3,6,5,4,9,8,2,7};
     /*   int count=0;
        for (int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            if (min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
                count++;
            }
        }
        for (int a:arr
             ) {
            System.out.print(a);
        }
        System.out.println(count);*/
        /*for (int a:dpai(arr)
             ) {
            System.out.print(a);
        }*/
        System.out.println(dpai(arr));
    }
    public static int[] pai(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int max=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[max]<arr[j]){
                    max=j;
                }

            }
            if (max!=i){
                int temp=arr[max];
                arr[max]=arr[i];
                arr[i]=temp;
            }

        }
        return arr;
    }
    public static int dpai(int[] arr){
       /* for (int i=arr.length-1;i>=0;i--){
            int min=i;
            for (int j=0;j<i;j++){
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            if (min!=i){
                int temp =arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }

        }*/

            int i=3;
        for (int j=0;j<arr.length;j++){
            if (arr[j]<arr[i]){
                i=j;
        
            }
        }
        return arr[i];
    }

}
