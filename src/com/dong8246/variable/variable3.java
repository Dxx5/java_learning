package com.dong8246.variable;

import java.util.Scanner;

public class variable3 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       //用Scanner获取用户输入
        //1.接受键盘输入的整数
        int num = sc.nextInt();
        System.out.println(num);
        //2.接受键盘输入的浮点数
        double num2 = sc.nextDouble();
        System.out.println(num2);
        //3.接受键盘输入的字符串
        String str = sc.next();
        System.out.println(str);
}
