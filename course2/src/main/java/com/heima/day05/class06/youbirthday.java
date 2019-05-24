package com.heima.day05.class06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class youbirthday {
    public static void main(String[] args) throws ParseException {
        String birth ="1998-01-01";
        String today="2000-01-01";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
         Date B=simpleDateFormat.parse(birth);
         Long b=B.getTime();
         Date T=simpleDateFormat.parse(today);
         long t=T.getTime();
         long youbieth=t-b;
        System.out.println(youbieth/1000/60/60/24);



    }
}
