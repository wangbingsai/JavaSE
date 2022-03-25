package duotai;

/**
 * @Author 空白
 * @Date 2022/2/22 17:24
 * @Version 1.0
 */
public abstract class  Animal {
    public abstract void eat();
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("dog eat");
    }
}
class Master{
    public void food(Animal a){
        a.eat();
    }
}
class Main{
    public static void main(String[] args) {
        Master master = new Master();
        Animal dog = new Dog();
        master.food(dog);
    }
}
