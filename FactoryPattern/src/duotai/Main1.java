package duotai;

/**
 * @Author 空白
 * @Date 2022/2/22 17:38
 * @Version 1.0
 */
public class Main1 {
    public static void main(String[] args) {
        Master1 master1 = new Master1();
        Dog1 dog1 = new Dog1();
        Cat cat = new Cat();
        master1.food(dog1);
        master1.food(cat);
    }
}
class Dog1{
    public void eat(){
        System.out.println("dog eet!!");
    }
}
class Cat{
    public void eat(){
        System.out.println("cat eet!!");
    }
}
class Master1{
    public void food(Dog1 dog1){
        dog1.eat();
    }
    public void food(Cat cat){
        cat.eat();
    }


}
