package com.heima.day05.class05;

import java.util.Date;

/*
date常用方法
毫秒值-date

date转毫秒值
返回值long  参数无
 */
public class date {
    public static void main(String[] args) {
        Date d=new Date();
        d.setTime(60*60*1000);
        System.out.println(d);

        long i=d.getTime();
        System.out.println(i);
    }
}
