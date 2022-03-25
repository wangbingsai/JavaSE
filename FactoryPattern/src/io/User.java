package io;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/**
 * @Author 空白
 * @Date 2021/9/7 15:58
 * @Version 1.0
 */
public class User  implements Serializable {



    private static final long serialVersionUID = -7820460937258643891L;
    private String name;
    private int age1;
    private int a ;
    private int b;


    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age1 = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age1;
    }

    public void setAge(Integer age) {
        this.age1 = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age1 +
                '}';
    }


}
