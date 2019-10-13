package com.yixianen.www;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BianLi {
    public static void main(String[] args) {
        List<Hero> heroes = new ArrayList<>();
        //将5个Hero放入容器
        for (int i = 0; i < 5; i++) {
            heroes.add(new Hero("hero" + i));
        }
        //第一种遍历  for循环
        System.out.println("--------使用for循环遍历---------");
        for (int i = 0; i < heroes.size(); i++) {
            Hero h = heroes.get(i);
            System.out.println(h);
        }
        //第二种遍历  迭代器遍历
        System.out.println("--------使用while的iterator---------");
        Iterator<Hero> it = heroes.iterator();
        //从最开始的位置判断“写一个”位置是否有数据
        //如果有，通过next取出来，并且把指针向下移动
        //直到写一个位置没有数据
        while (it.hasNext()) {
            Hero h = it.next();
            System.out.println(h);
        }

        //迭代器的for写法
        System.out.println("---------使用for的iterator----------");
        for (Iterator<Hero> iterator = heroes.iterator(); iterator.hasNext(); ) {
            Hero hero = iterator.next();
            System.out.println(hero);
        }

        //第三种遍历  使用增强型for循环
        System.out.println("--------增强型for循环-------");
        for (Hero h : heroes) {
            System.out.println(h);
        }
    }
}
