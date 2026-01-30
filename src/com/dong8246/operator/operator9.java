package com.dong8246.operator;
//关系运算符使用练习 2.键盘录入一个三位数，判断是否能被三整除
import java.util.Scanner;
public class operator9 {
    public static void main(String[] args){
        System.out.println("请输入一个三位数：");
        Scanner sc = new Scanner(System.in);
        int num  =sc.nextInt();
        boolean result = num%3 ==0;
        System.out.println("该数是否能被3整除：" + result);
    }
}
