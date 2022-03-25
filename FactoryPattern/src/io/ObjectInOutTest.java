package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 空白
 * @Date 2021/9/7 15:58
 * @Version 1.0
 */
public class ObjectInOutTest {

    public static void main(String[] args) throws Exception {
/*        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("text2"));
//        oos.writeObject(new User("张三",18));
        List<User> objects = new ArrayList<>();
        objects.add(new User("李四",13));
        objects.add(new User("赵柳",14));
        objects.add(new User("王五",15));
        oos.writeObject(objects);*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("text2"));
//        Object o = ois.readObject();
//        System.out.println(o);
        List<User> o = (List<User>)ois.readObject();
        for (User o1 : o){
            System.out.println(o1);
        }
    }
}
