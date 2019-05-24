package com.heima.day05.class09;

import java.util.Calendar;

/*
提供了一些操作年月日时的方法
 */
public class calendar {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH,3);
//get获取
    //  calendar.set(Calendar.MONTH,2);
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH)+1;
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year +"年"+month +"月"+day+"日");


        //set把指定的字段改成指定的值

    }


}
