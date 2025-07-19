import static org.junit.Assert.assertEquals;

public class Sample11_Init {
    public void test() {
        Sub a = new Sub();

        a.foo(100);
        a.foo("hello,world");
    }

}
class Super {
    public void foo(int i){
        System.out.println("SuperClass:"+i);
    }
    public void foo(String s){
        System.out.println("SuperClass:"+s);
    }
}
class Sub extends Super{

    public void foo(int i){
        System.out.println("SubClass:"+i);
    }
    public void foo(String s){
        System.out.println("SubClass:"+s);
    }

}
