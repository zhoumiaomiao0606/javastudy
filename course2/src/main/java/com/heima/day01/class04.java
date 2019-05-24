package com.heima.day01;

import lombok.Data;

@Data
public class class04 {



    private String name;
    private  String gender;
    private  int age;

    public class04(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public class04() {
    }
}
