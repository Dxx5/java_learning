package com.dong8246.variable;
//变量的类型和细节
public class variable2 {
    public static void main(String[] args){
/*定义8种类型的变量：
  整型变量：byte、short、int、long
  浮点型变量：float、double
  字符型变量：char
  布尔型变量：boolean

  变量的定义格式：数据类型 变量名 = 值;
*/
        //1.定义byte类型的变量
        byte a = 127;
        System.out.println(a);
        //2.定义short类型的变量
        short b = 32767;
        System.out.println(b);
        //3.定义int类型的变量
        int c = 2147483647;
        System.out.println(c);
        //4.定义long类型的变量
        //细节：long类型数据必须以L结尾，一般写成大写的
        long d = 9223372036854775807L;
        System.out.println(d);
        //5.浮点数类型
        //细节：float、double类型数据必须以F结尾，一般写成大写的
        float e = 3.14F;
        System.out.println(e);
        //6.定义布尔类型的变量
        boolean f = true;
        System.out.println(f);

    }

}
