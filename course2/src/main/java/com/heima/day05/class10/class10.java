package com.heima.day05.class10;

public class class10 {
    //判断一个int类型的数据是否在int类型的范围
    public static void main(String[] args) {
        int n =10;
        if(n >= Math.pow(-2,31) && (n<=Math.pow(2,31)-1)){
            System.out.println("这个数据符合范围");
        }
        else {
            System.out.println("不符合需求");
        }
    }
    //      包装类把八大基本类型包装起来，首字母大写Integer  String-int int-String

    //把字符串转换成int    Integer(int value),Integer(strign)
//static Integer.parseint(strign)


   // tostring();//object
    //Integer.tostring();
}
