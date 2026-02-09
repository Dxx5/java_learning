package com.dong8246.loop;
/*
for循环练习：键盘录入两个数字表示一个范围
            统计这个范围内有多少个数字能同时被3和5整除
 */
import java.util.Scanner;
public class forDemo2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = a>b?a:b;
        int min = a<b?a:b;
        int count = 0;
        for(int i = min;i<=max;i++){
            if(i%3==0&&i%5==0){
                count++;
            }
        }
        System.out.println("共有 "+count+" 个数字能同时被3和5整除");
    }
}
