package com.dong8246.If;
//多个条件判断
//if语句练习：键盘录入三个小数代表三角形的三条边，判断是否能构成三角形，并判断构成三角形的类型
import java.util.Scanner;
public class ifDemo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三条边:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("能构成三角形");
            if(a==b && b==c){
                System.out.println("等边三角形");
            }else if(a==b||b==c|a==c)
                System.out.println("等腰三角形");
            else if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a)
                System.out.println("直角三角形");
        }
    }
}
