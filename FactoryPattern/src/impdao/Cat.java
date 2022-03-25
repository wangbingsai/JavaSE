package impdao;

import imp.Animal;

public class Cat implements Animal {
    @Override
    public void draw() {
        System.out.println("创建猫类对象!");
    }
}
