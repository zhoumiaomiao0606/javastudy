package com.heima.day05.class13;
//判断字符串中间的字符是否是一个原音qaq
public class yuanying {

    public static void main(String[] args) {

    }

    public Boolean check(String zifu){

String s=zifu.toLowerCase();
Boolean b=s.matches("\\w[aeiouAEIOU]\\w");//任意字符[a-z][A-Z][0-9]
return b;
    }
}
