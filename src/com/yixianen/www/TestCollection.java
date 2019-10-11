package com.yixianen.www;

import java.util.ArrayList;

/*
容器
 */
public class TestCollection {
    public static void main(String[] args) {
        //容器类ArrayList，用于存放对象
        ArrayList heros = new ArrayList();
        ArrayList anotherHeros = new ArrayList();

        //把5个对象加入到ArrayList中
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero" + i));
        }

        anotherHeros.add(new Hero("hero a"));
        anotherHeros.add(new Hero("hero b"));
        anotherHeros.add(new Hero("hero c"));
        System.out.println(heros.toString());
        //在指定位置增加对象
        Hero specialHero = new Hero("special hero");
        heros.add(3,specialHero);
        System.out.println(heros.toString());
        //获取指定位置的对象
        System.out.println(heros.get(3));
        Hero hs[] = (Hero[]) heros.toArray(new Hero[]{});
        System.out.println("数组："+ hs);
        //遍历数组
        for (Hero b: hs) {
            System.out.println(b);
        }
        heros.addAll(3,anotherHeros);//默认是添加到最后，可以选择插入到指定位置
        System.out.println("把另一个ArrayList的元素都添加到当前ArrayList");
        System.out.println(heros);
    }
}
