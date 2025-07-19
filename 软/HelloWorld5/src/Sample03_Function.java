public class Sample03_Function {
    static int f(int i){  //方法的声明和定义
        i++;
        return i;
    }
    public static void main(String[] args) {
        int n = 5;
        int value = f(n);  //方法的调用
        System.out.println("n= "+ n);
        System.out.println("f(n)= "+ value);
    }
}