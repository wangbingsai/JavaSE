package Class;


import dao.User2;

import java.util.Date;

/**
 * @Author 空白
 * @Date 2021/9/13 18:38
 * @Version 1.0
 */
public class newInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

           Class user = Class.forName("Class.User");
            Object o = user.newInstance();
            System.out.println(o);

    }
}
