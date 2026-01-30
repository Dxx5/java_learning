package com.dong8246.operator;
//关系运算符使用练习 1.键盘录入两个人的年龄，并比较两个人的年龄
import java.util.Scanner;
public class operator8 {
    public static void main(String[] args){
        System.out.println("请输入第一个人的年龄");
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        System.out.println("请输入第二个人的年龄");
        int age2 = sc.nextInt();
        boolean result = age1 > age2;
        System.out.println("第一个人的年龄是否大于第二个人的年龄：" + result);
    }
}
