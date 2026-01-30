package com.dong8246.If;
//两个条件判断
//if else语法练习，键盘录入一个人的成绩，大于60，输出通过，小于60，输出再接再厉
import java.util.Scanner;
public class ifDemo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = sc.nextDouble();
        if(score>=0&&score<=100){
            if(score>=60){
                System.out.println("通过");
            }else{
                System.out.println("再接再厉");
            }
        }else{
            System.out.println("输入的分数有误");
        }
    }
}
