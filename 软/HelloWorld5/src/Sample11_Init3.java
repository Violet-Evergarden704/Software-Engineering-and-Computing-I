public class Sample11_Init3 {

    public static void main(String args[]){
        Super3 a = new Sub3();

        a.foo(100);
        a.foo("hello,world");

        Sub3 b = new Sub3();

        b.foo(100);
        b.foo2(100);

        String s = "oofooabcfoo";
        String[] list = s.split("o");
        System.out.println("！"+list.length);
        for (String item:list
             ) {
            System.out.println("："+item);

        }
        String s1="world";
        String s2="world"+"";
        if( s1==s2 )
            System.out.println("true");
        else
            System.out.println("false");
    }



}

class Super3 {
    public void foo(int i){
        System.out.println("SuperClass:foo(i):"+i);
    }
    public void foo(String s){
        System.out.println("SuperClass:foo(s):"+s);
    }
}
class Sub3 extends Super3{

    public void foo(int i){
        System.out.println("SubClass:foo(i):"+i);
    }
    public void foo(String s){
        System.out.println("SuperClass:foo(s):"+s);
    }
    public void foo2(int i){
        System.out.println("SubClass:foo2(i):"+i);
    }

}
