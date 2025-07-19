
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class Sample01_TwoIntAdd {
    public static void main(String[] args){

        twoIntAdd();

    }
    public static int add(int i,int j){
        int result = i + j;
        return result;
    }


    public static void twoIntAdd(){
        int one=0;
        int two=0;
        int sum = 0;
        String temp=null;

        try {

            BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("please enter the first integer:");
            temp=br1.readLine();// 1、输入
            one=Integer.parseInt(temp); // 2.1 处理(转为int)

            System.out.println("please enter the second integer:");
            temp=br1.readLine();
            two=Integer.parseInt(temp);

        } catch (IOException e) {
            e.printStackTrace();
        }

        sum = add(one,two); // 2.2 、处理（求和）

        System.out.println(one+"+"+two+"="+sum);// 3、输出
    }
}
//class Test{
//    public static void main(String[] args){
//        for(int i =1; i<10;i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.printf("i = %d ",i);
//        }
//    }
//}

