package com.heima.day01;

public class myarrays {
    private  myarrays(){};
    //    获取指定数组中的最大元素
    public static  int max(int[] arr){

   int max=arr[0];
   for(int s=1;s<arr.length;s++){
       if(arr[s]>max){
           max=arr[s];
       }
   }
   return max;

    }

    //获取指定数组中的索引位置
    public static int getindex(int[] arr,int index){

        return index;
    }
}
