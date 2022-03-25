package Comparable1;

import java.util.Comparator;

/**
 * @Author 空白
 * @Date 2021/9/4 23:10
 * @Version 1.0
 */
public class User implements Comparable<User> {
     int age;
     String name;

    public User(int age,String name) {
        this.age = age;
        this.name =name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        if(this.age == o.age){
            return this.name.compareTo(o.name);
        }else{
            return this.age-o.age;
        }
    }
}
class UserComparator implements Comparator<User>{

    @Override
    public int compare(User o1, User o2) {
        return o1.age - o2.age;
    }
}
