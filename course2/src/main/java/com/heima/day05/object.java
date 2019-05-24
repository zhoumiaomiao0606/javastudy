package com.heima.day05;
//   return getClass().getName() + "@" + Integer.toHexString(hashCode());
public class object {
    public static void main(String[] args) {
       student s= new student();
        System.out.println(s.toString());
    }

}
class student{
    String name;
    int age;

}
