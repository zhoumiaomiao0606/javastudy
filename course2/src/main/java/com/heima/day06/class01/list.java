package com.heima.day06.class01;

import java.util.LinkedList;

public class list {

    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.addFirst("zmm");
        linkedList.addLast("zmm");//新增
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());//获取
        System.out.println(linkedList.removeLast());//删除索引为0
        System.out.println(linkedList.removeFirst());//删除索引为size-1
    }
}
