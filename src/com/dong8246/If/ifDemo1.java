package com.dong8246.If;
//单一条件判断
//if语法练习：接受一个输入表示人的体温，如果体温高于37.5，则提示 fever，否则提示 no fever
import java.util.Scanner;
public class ifDemo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入人的体温：");
        double temp = sc.nextDouble();
        if(temp>37.5){
            System.out.println("fever");
        }
        else{
            System.out.println("no fever");
        }
    }
}
