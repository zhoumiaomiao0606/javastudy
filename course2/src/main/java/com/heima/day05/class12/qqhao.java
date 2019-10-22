package com.heima.day05.class12;
//校验qq号， 5-15，0不能开头，都是数字
public class qqhao {


    public static void main(String[] args) {
        System.out.println( checkqq("012345"));
    }

    public static Boolean checkqq(String qq){

//[1-9] 非0，
  Boolean flage=qq.matches("[1-9][0-9]{4,14}");
return flage;
    }



        //字符本身代表本身x字符x
        //\\反斜杠
        //[abc],a或b或c
        //['abc]除了a或b或c
        //[a-zA-Z]a到z或是A-Z


    }

