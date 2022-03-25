package work.yukong.suanfa.Queue;

import java.util.Stack;

/**
 * @Author 空白
 * @Date 2022/3/14 21:26
 * @Version 1.0
 */
public class QueueArray {
    /**
     * 头指针
     */
    private int front;
    /**
     * 尾指针
     */
    private int rear;
    /**
     * 队列最大容量
     */
    private int MAX_Size;
    /**
     * 数组模拟队列
     */
    private int[] arr;
    public QueueArray(int maxSize) {
        //初始化队列
        rear = -1;
        front = -1;
        MAX_Size = maxSize;
        arr = new int[MAX_Size];
    }
    public boolean isEmpty() {
        //头指针等于尾指针队列为空
       return front == rear;
    }
    public boolean isFull() {
        //尾指针等于最大容量-1，队列已满
        return rear == MAX_Size-1;
    }
    public void add(int value){
        //添加数据时先判断队列是否已满
        if(!isFull()){
            //添加数据尾部指针后移
            rear++;
            arr[rear] = value;
        }else {
            System.out.println("队列已满");
            return;
        }
    }
    public int get(){
        //取出数据先判断队列是否为空
        if(!isEmpty()){
            //如果不为空头指针后移取出数据
            front++;
            return arr[front];
        }else{
            throw new RuntimeException("队列为空！");
        }
    }
    public int head(){
        if (isEmpty()) {
            throw new RuntimeException("队列为空！");
        }else{
            return arr[front+1];
        }
    }
    public void show(){
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }else {
            for (int i = 0; i < MAX_Size; i++) {
                System.out.printf("arr[%d] = %d\n",i ,arr[i]);
            }
        }

    }

}
