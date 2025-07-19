package org.example;
import java.util.Scanner;//导入包,找到scanner这个类,要在类的定义之前import

public class Main {
    public static void main(String[] args) {
        int age = 0;
        double height = 0;
        char name ;
        Scanner scanner = new Scanner(System.in);/*
        这个里面Scanner是告诉我要开始用这个类了，scanner是变量名可以修改
        但是除了scanner以外的都不能改，new是关键字
        */
        age = scanner.nextInt();//用scanner来获得输入的int值

    }
}