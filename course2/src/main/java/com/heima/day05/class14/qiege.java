package com.heima.day05.class14;
/*
切割字符串，aa,bb,cc split(正则表达式)
1 99 2 33
-1，，，，，   99 ，4 ，23   " +" 一个或者多个
 */
public class qiege {
    public static void main(String[] args) {

      //  String s="aa,bb,cc";
      //  String[] arr=s.split(",");//从逗号开始分割
     //   fenge(arr);

/*String a="1 99 2 33";
String[] arr=a.split(" ");
fenge(arr);*/

String a="-1,,,,,2,3,4,5";
String[] arr=a.split(",+");
fenge(arr);
    }

    public static void fenge(String[] aa){
for(int i=0;i<aa.length;i++){
    System.out.println(aa[i]);
}

    }

}
