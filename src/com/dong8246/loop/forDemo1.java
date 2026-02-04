package com.dong8246.loop;
//for循环练习：键盘录入一个不小于0的整数，求1~n的累加和
import java.util.Scanner;
public class forDemo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个不小于0的整数：");
        int n = sc.nextInt();
        int sum = 0;
        if(n<0){
            System.out.println("输入的数字有误！");
            return;
        }else{
            for(int i = 0;i<=n;i++){
                sum+=i;
            }

        }
        System.out.println("1~"+n+"的累加和为："+sum);
    }
}
