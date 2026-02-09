package com.dong8246.loop;
//练习dowhile循环，掌握dowhile语法和特点
public class dowhileDemo1 {
    public static void main(String[] args){
        int i = 5;
        do{
            System.out.println(i);
            i--;
        }while(i>10);
    }
}
//特点：先执行后判断，循环至少执行一次