package com.heima.day05.class06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//simpledateformat格式化 date-string   string  format(date)
//string-date   date  paras(string)
//simpledateformat()
//simpledateformat(String partener)

public class dateformart {

    public static void main(String[] args) throws ParseException {
//使用默认模式进行对象的构建
    /*    SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
        Date date=new Date();
        String s=simpleDateFormat.format(date);
        System.out.println(s);
//解析成日期格式
        Date D=simpleDateFormat.parse(s);//解析的对象必须是对象默认的模式
        System.out.println(D);
*/

SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
Date date=new Date();
String s=simpleDateFormat.format(date);
        System.out.println(s);

        Date r=simpleDateFormat.parse(s);
        System.out.println(r);


    }
}
