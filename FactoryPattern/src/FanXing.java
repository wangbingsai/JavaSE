import java.util.*;

/**
 * @Author 空白
 * @Date 2021/9/4 2:03
 * @Version 1.0
 */
public class FanXing {
    public static void main(String[] args) {
        Test13<Integer> test13 = new Test13<>();
        Integer s = test13.doSome(1);
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(12);
        myList.add(13);
        for(Integer a : myList){
            System.out.println(a);
        }
        System.out.println("-----------------------------------");
        HashMap<Integer, String > map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(3,"王柳");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for(Map.Entry<Integer,String> note : set){
            //通过Map.Entry的getKey(),和getValue()获取键值对
            System.out.println(note.getKey()+"---->"+note.getValue());
        }
     /*   Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next+"----->"+map.get(next));
        }
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer,String> map1 : set){
            System.out.println(map1.getKey()+"---->"+map1.getValue());

        }*/
       /* Set<Integer> keys = map.keySet();
//获取set的迭代器
        Iterator<Integer> it = keys.iterator();
//循环遍历
        while(it.hasNext()){
//遍历key
            Integer key = it.next();
//通过key获取Map集合中的value
            String value = map.get(key);
            System.out.println(key+"--->"+value);

        }
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for(Map.Entry<Integer,String> note : set){
            //通过note的getkey()方法和getValue()方法获取键值
            System.out.println(note.getKey()+"--->"+note.getValue());
        }*/

    }
}
class Test13<T>{
    public T doSome(T o){
        return null;
    }
}
