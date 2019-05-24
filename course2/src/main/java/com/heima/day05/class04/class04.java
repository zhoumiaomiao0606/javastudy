package com.heima.day05.class04;
//Date() 当前系统时间返回毫秒数，  Date(long date)根据指定时间创建对象，指定时间不是具体时间，是一个毫秒值

import java.util.Date;

//构造方法 date
public class class04 {

    public static void main(String[] args) {
      //  Date d=new Date();
       // System.out.println(d);

        Date d=new Date(1000*60*60*24*50*365);
        System.out.println(d);
    }
}
