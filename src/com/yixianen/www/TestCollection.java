package com.yixianen.www;

import java.util.ArrayList;

/*
容器
 */
public class TestCollection {
    public static void main(String[] args) {
        //容器类ArrayList，用于存放对象
        ArrayList heros = new ArrayList();
        //把5个对象加入到ArrayList中
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero" + i,i));
        }
        System.out.println(heros.toString());
        //在指定位置增加对象
        Hero specialHero = new Hero("special hero",5);
        heros.add(3,specialHero);
        System.out.println(heros.toString());
        //获取指定位置的对象
        System.out.println(heros.get(3));




    }
}
