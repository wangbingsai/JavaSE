package impdao;

import imp.Animal;

public class Dog implements Animal {
    @Override
    public void draw() {
        System.out.println("创建狗对象");
    }
}
