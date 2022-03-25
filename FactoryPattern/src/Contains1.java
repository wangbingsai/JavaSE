
import java.util.*;

/**
 * @Author 空白
 * @Date 2021/9/2 23:57
 * @Version 1.0
 */
public class Contains1 {
    private String name ;

    public Contains1(String name) {
        this.name = name;
    }




    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}




class Main1{
    public static void main(String[] args) {
        //更改索引的元素为第二个参数
        List c = new ArrayList();
        c.add("A");
        c.add("B");
        c.add("B");
        c.add("C");
        c.set(0,"Z");
        System.out.println(c.get(0));//打印Z

    }
}