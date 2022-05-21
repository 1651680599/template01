package com.imooc;

import java.util.Date;

public class Today {
    public static void main(String[] args) {
        System.out.println("today time is :" + System.currentTimeMillis());
        System.out.println("now time is :" + System.currentTimeMillis());
        System.out.println("now time is :" + System.currentTimeMillis() + new Date());
        System.out.println("cuurent time is :" + System.currentTimeMillis() + new Date());
    }
}
