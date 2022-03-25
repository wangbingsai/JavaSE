package Class;

/**
 * @Author 空白
 * @Date 2021/9/13 18:39
 * @Version 1.0
 */
public class User {
    public String name;
    public String addr;
    private int age ;
    protected String no;
    boolean sex;

    public User() {
    }

    public User(String name, String addr, int age, String no, boolean sex) {
        this.name = name;
        this.addr = addr;
        this.age = age;
        this.no = no;
        this.sex = sex;
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", age=" + age +
                ", no='" + no + '\'' +
                ", sex=" + sex +
                '}';
    }
}
