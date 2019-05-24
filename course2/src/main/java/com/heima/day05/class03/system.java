package com.heima.day05.class03;
//arraycopy
//currentmiller      exit 退出虚拟机
public class system {

    public static void main(String[] args) {
     //  long l= System.currentTimeMillis();
      //  System.out.println(l);
        long s=System.currentTimeMillis();
        for(int i=0;i<100;i++){
            System.out.println("测试一下");
            System.out.println(i);
            if(i==50){
                System.exit(0);
            }
        }
        long t=System.currentTimeMillis();
        System.out.println(t-s);
    }


}
