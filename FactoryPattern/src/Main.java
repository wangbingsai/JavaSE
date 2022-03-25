import imp.Animal;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Animal factory1 = factory.getFactory("cat");
        factory1.draw();
    }
}
