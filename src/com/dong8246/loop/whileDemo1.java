package com.dong8246.loop;
//while循环练习：键盘录入一个整数，计算它每一位的数字之和，如果是负数，取绝对值进行运算
import java.util.Scanner;
public class whileDemo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println(sum);
    }
}
