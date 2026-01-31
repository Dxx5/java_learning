package com.dong8246.Switch;
//switch选择语句练习：键盘录入两个数和运算符，根据运算符进行运算
import java.util.Scanner;
public class switchDemo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("请输入运算符");
        char c = sc.next().charAt(0);
        switch(c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(b!=0?a/b:"除数不能为零");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
