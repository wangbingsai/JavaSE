import org.junit.Test;

public class T {
    A o1;
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c= new C();
        D d = new D();
        T t = new T();

        t.o1=a;
        a.o2=b;
        b.o3=c;
        c.o4=d;
        System.out.println(t.o1.o2.o3.o4.i);

    }
    @Test
    public  void  tests(){
        int a = 0;
        int b = 0;
        a = a++;
        b = a++;
        System.out.println("a = " + a + ", b = " + b);
    }

}
class A{
    B o2;
}
class B{
    C o3;
}
class C{
    D o4;
}
class D{
    int i;

}
