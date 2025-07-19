class A {
    static int n = 5;
    public static int method(){
        return n++;
    }
}

class B extends A {
    static int m = 10;
    public static int method(){
        return m++;
    }
}



class A2{
    public String flag = "Father";
    public void showFlag(){
    System.out.println(flag);
    }
}
interface Flag{
    public void showFlag();
}
class B2 extends A2 implements Flag{
    public String flag = "Son";
    public void showFlag(){
        System.out.println(flag);
    }
    public static void main(String[] args) {
        new B2().showFlag(); //Son
        Flag f = new B2();
        f.showFlag();
        A2 a = new B2();
        System.out.println(a.flag);
        A2 a2 = new A2();
        System.out.println(a2.flag);
        B2 b = new B2();
        System.out.println(b.flag);
    }
}
interface A3{
    default void show() {
        System.out.println("showA");
    }
}

class B3{
    public void show() {
        System.out.println("showB");
    }
}

class Son3 extends B3 implements A3 {}