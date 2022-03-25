package Comparable1;

import java.util.TreeSet;

/**
 * @Author 空白
 * @Date 2021/9/4 23:11
 * @Version 1.0
 */
public class ComparableTest {
    public static void main(String[] args) {
        TreeSet<User> tree = new TreeSet<>();
        User user = new User(18,"zhangsan");
        User user1 = new User(18,"lisi");
        tree.add(user);
        tree.add(user1);
        for (User u : tree){
            System.out.println(u);
        }
    }
}
