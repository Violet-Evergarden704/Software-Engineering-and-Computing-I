class Sample
{
    Sample(String s)
    {
        System.out.println(s);
    }
    Sample()
    {
        System.out.println("Sample默认构造函数被调用");
    }
}

class Father{


    Sample sam1=new Sample("父类 sam1成员初始化");


    Father()
    {
        System.out.println("父类 Test默认构造函数被调用");
    }
    Sample sam2=new Sample("父类 sam2成员初始化");


}


class Son extends Father
{

    Son()
    {
        System.out.println("子类 TestSub 默认构造函数被调用");
    }
    Sample sam1=new Sample("子类 sam1成员初始化");

    Sample sam2=new Sample("子类 sam2成员初始化");


}

public class Sample11_Init2{
    public static void  main(String  str[])
    {
        Father a=new Son();
    }
}
