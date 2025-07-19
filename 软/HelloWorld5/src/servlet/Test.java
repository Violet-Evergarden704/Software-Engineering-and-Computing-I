package servlet;

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
        System.out.println("SuperClass:"+s);
    }

}
public class Test {
    public static void main(String args[]){
        Sub a = new Sub();

        a.foo(100);
        a.foo("hello,world");
    }
}

 class Conditional {
    public static void main(String args[]) {
        int x = 4;
        System.out.println("value is " + ((x > 4) ? 99.9: 9));
    }
}


class ZeroTest {
    public static void main(String[] args) {
        try {
            int i = 100 / 0;
            System.out.print(i);
        } catch (Exception e) {
            System.out.print(1);
            throw new RuntimeException();
        } finally {
            System.out.print(2);
        }
        System.out.print(3);
    }
}


 class SwitchTest {
    public static void main (String []args) { System.out.println ("value =" +switchIt(4)); }
    public static int switchIt(int x) {
        int j = 1;
        switch (x) {
            case 1: j++;
            case 2: j++;
            case 3: j++;
            case 4: j++;
            case 5: j++;
            default:j++;
        }
        return j + x;
    }
}



class Example {
    String str=new String("good");
    char[]ch={'a','b','c'};
    public static void main(String args[]) {
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]) {
        str="test ok";
        ch[0]='g';
    }
}
class foo {
    static String s;
    public static void main (String[] args) {
        System.out.println ("s=" + s);
    }
}



//class Base {
//    public void method() {
//        System.out.println("Base");
//    }
//}
//class Son extends Base {
//    public void method() {
//        System.out.println("Son");
//    }
//    public void methodB() {
//        System.out.println("SonB");
//    }
//}
//public class Test01 {
//    public static void main(String[] args) {
//        Base base = new Son();
//        base.method();
//        base.methodB();  //编译不通过
//    }
//}


//class Base {
//    static void test() { System.out.println("Base.test()"); }
//}
//class Child extends Base {
//    void test() {  //编译不通过
//        System.out.println("Child.test()");
//        Base.test(); //Call the parent method
//    }
//    static public void main(String[] a) { new Child().test(); }
//}



 class Base {
    private String baseName = "base";
    public Base() { callName(); }
    public void callName() { System.out.println(baseName); }
    static class Sub extends Base {
        private String baseName = "sub";
        public void callName() { System.out.println (baseName) ; }
    }
    public static void main(String[] args) { Base b = new Sub(); }
}




 class Demo {
    class Super {
        int flag = 1;
        Super() { test(); }
        void test() { System.out.println("Super.test() flag=" + flag); }
    }
    class Sub extends Super {
        Sub(int i) {
            flag = i;
            System.out.println("Sub.Sub()flag=" + flag);
        }
        void test() { System.out.println("Sub.test()flag=" + flag); }
    }
    public static void main(String[] args) {
        new Demo().new Sub(5);
    }
}



 class FatherClass {
    public FatherClass() { System.out.println("FatherClass Create"); }
}
 class ChildClass extends FatherClass {
    public ChildClass() { System.out.println("ChildClass Create"); }
    public static void main(String[] args) {
        FatherClass fc = new FatherClass();
        ChildClass cc = new ChildClass();
    }
}
