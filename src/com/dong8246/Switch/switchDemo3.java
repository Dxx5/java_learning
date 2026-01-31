package com.dong8246.Switch;
//switch选择语句练习:case穿透。键盘录入一个月份，输出对应的季节
import java.util.Scanner;
public class switchDemo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        switch(month){
            case 3:
            case 4:
            case 5:
            System.out.println("春季");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
                case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入错误");
                break;

        }
    }
}
