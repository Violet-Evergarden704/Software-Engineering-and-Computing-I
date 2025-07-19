public class Sample02_Variable {
    //oo.game.Member variable
    public int number;
    public static final double PI= 3.1415926;
    public static String s = "您好！";

    //oo.game.Member method
    //1.Constructor
    public Sample02_Variable(){

    }
    //2.Other method
    public static void main(String[] args){
        System.out.println(Integer.MAX_VALUE);

        System.out.printf("%d ~ %d%n",Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.printf("%f ~ %f%n",Double.MIN_VALUE,Double.MAX_VALUE);
        System.out.printf("%e ~ %e%n",Double.MIN_VALUE,Double.MAX_VALUE);
        System.out.printf("%h ~ %h%n",Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.printf("%X ~ %X%n",Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.printf("%b ~ %b%n",true,false);
        System.out.printf("%10d ~ %10d%n",123,45678);
        System.out.printf("%10d ~ %10d%n",12435,45678);
        System.out.printf("%.2f ~ %2f%n",1.2345,145.678);
        System.out.printf("%.2f ~ %2.2f%n",1.2368,45.678);

        int l =0;
        System.out.println(l);
        System.out.println(s+"\u0048\u0065\u006C\u006C\u006F");

        System.out.println((2+2+8)/4);
        System.out.printf("%b%n",(2+2*4)/3<3);

        int score=56;
        System.out.printf("%c%n",score>=60 && score<70?'是':'否');
        int number =1024;
        System.out.printf("%d%n",number>>9);
        System.out.printf("%d%n",number++); //number--;
        System.out.printf("%d%n",++number);

        int a =(int)123.546;
        //a+=number;//a = a+number
        System.out.printf("%d%n",a);

        int b =10/3;
        //a+=number;//a = a+number
        System.out.printf("%d%n",b);

        number = 7;
        double c =number*1.0/3;
        //a+=number;//a = a+number
        System.out.printf("%f%n",c);

        int remain = number%2;

        if(remain==0) {
            System.out.println("Even number!");
        }
        else {
            if(true)
                System.out.println("Odd number!");
            else {

            }
        }

        System.out.println(getGrade(90));

        for(int i=0;i<10;i++)
            System.out.print(i+"\n");

        for(int i =1;i<=9;i++){
            for(int j =1; j<=i;j++)
            {
                System.out.printf("%d*%d=%2d ",i,j,i*j);
            }
            System.out.println();
        }

        while(true){
            int n = (int) (Math.random()*10);
            System.out.println(n);
            if(n ==5){
                System.out.println("I hit 5");
                break;
            }
        }

        int n=0;
        while((n = (int) (Math.random()*10))!=5){
            System.out.println(n);
        }
        System.out.println("I hit 5");

        do{
            n = (int) (Math.random()*10);
            System.out.println(n);
        }while(n!=5);
        System.out.println("I hit 5");

        for(int i =1;i<10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
        for(int i =1;i<10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }

        System.out.println("GCD is "+gcd(1000,495));


    }
    public static int gcd(int m, int n){

        if(m%n ==0) return n;
        else return gcd(n,m%n);

    }

    //    public static int gcd(int m, int n){
//        int temp;
//        if(m<n){
//            temp = m;
//            m = n;
//            n = temp;
//        }
//        while (m % n!=0){
//            temp = m;
//            m = n;
//            n = temp % n;
//        }
//        return n;
//    }
    public static char getGrade(int score){
        //>=90 'A'
        //<90&&>=80 'B'
        //>=70 'C'
        //>=60 'D'
        //<60 'F'
        char c=' ';
        int q = score/10;
        switch (q){
            case 10:
            case 9: c ='A';break;
        }

        return c;
//        if(score<=100&&score>=90) {
//            return 'A';
//        }
//        else if(score>=80)
//            return 'B';
//        else if(score>=70)
//            return 'C';
//        else if(score>=60)
//            return 'D';
//        else if(score>=0)
//            return 'F';
//        else
//            return 'X';//Error
    }
}
