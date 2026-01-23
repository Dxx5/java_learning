package com.dong8246.variable;

//变量的定义和计算
public class variable1 {
    public static void main(String[] args){
/*微信余额：100元
支付宝余额：10元
银行卡余额：20元
问题1:现在一共有多少钱？
问题2：微信收了10元红包，又发出去2元，余额是多少？
*/
        double weixin = 100;
        double zhifubao = 10;
        double bank = 20;
        System.out.println(weixin + zhifubao + bank);
        weixin = weixin - 10 + 2;
        System.out.println(weixin);
    }
}
//
