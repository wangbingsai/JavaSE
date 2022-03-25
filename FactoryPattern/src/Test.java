import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author 空白
 * @Date 2021/8/8 11:49
 * @Version 1.0
 */
public class Test {
    public Test() {
    }

    public static void main(String[] args) {

        /*Student s = new Student(18,"张三");
        Student2 s2 = new Student2();
        System.out.println(s.age + s.name );
        s=null;

        System.out.println(Student.sex);*/
        Student2 student = new Student2();
        student.m1();
    }
}
class Student{
    int age;
    String name;
    static String sex="男";
    public Student(int s1,String s2){
        age=s1;
        name=s2;
    }
}
class Student2{
    public void m1() {

        try {
            FileInputStream fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            System.out.println("你好");
        }

    }



}
