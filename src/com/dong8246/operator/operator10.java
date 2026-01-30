package com.dong8246.operator;
//逻辑运算符使用练习1.键盘录入一个整数，判断该数是否在1到100之间
import java.util.Scanner;
public class operator10 {
    public static void main(String[] args){
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = num>=1 & num<=100;
        System.out.println("该数是否在1到100之间：" + result);
    }
}
