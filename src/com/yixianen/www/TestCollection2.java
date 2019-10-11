package com.yixianen.www;

import java.util.ArrayList;
import java.util.List;

/*
泛型 Generic
 */
public class TestCollection2 {
    public static void main(String[] args) {
        //对于不适用泛型的容器，可以往里面放英雄，也可以放物品
        List heros = new ArrayList();
        heros.add(new Hero("盖伦"));

        //本来用于存放英雄的容器现在也可以放物品了
        heros.add(new Item("冰杖"));
        //对象转型会出现问题
        Hero h1 = (Hero) heros.get(0);
        //尤其是容器内放的对象太多的时候，就记不清楚哪个位置放的是哪种类型的对象了
//        Hero h2 = (Hero) heros.get(1);  //报错

        //引入泛型 Generic
        //声明容器的时候就指定了这种容器，只能放Hero，放其他就会出错
        List<Hero> genericheros = new ArrayList<Hero>();
        //简写形式,聊胜于无
        List<Hero> genericheros2 = new ArrayList<>();
        genericheros.add(new Hero("盖伦"));
        //如果不是Hero类型，根本放不进去
//        genericheros.add(new Item("冰杖"));
        //除此之外，还能存放Hero的子类
        //并且在读出数据的时候，不需要再进行转型了，因为里面肯定是放的Hero或其子类
        Hero h = genericheros.get(0);


    }
}
