package otherCollection;
/*
LinkDeList和双向链表Deque和队列queue
 */

import com.yixianen.www.Hero;

import java.util.LinkedList;

public class linkedListAndDeque {
    public static void main(String[] args) {
        //LinkedList是一个双向链表结构的list
        LinkedList<Hero> ll = new LinkedList<>();
        //所以可以很方便的在头部和尾部插入数据
        //在最后插入新的英雄
        ll.addLast(new Hero("Hero1"));
        ll.addLast(new Hero("Hero2"));
        ll.addLast(new Hero("Hero3"));
        System.out.println(ll);
        //在最前面插入新的英雄
        ll.addFirst(new Hero("HeroX"));
        System.out.println(ll);
        //查看最前面的英雄
        System.out.println(ll.getFirst());
        //查看最后面的英雄
        System.out.println(ll.getLast());
        //查看不会导致英雄被删除
        System.out.println(ll);
        //取出最前面的英雄
        System.out.println(ll.removeFirst());
        //取出最后面英雄
        System.out.println(ll.removeLast());
        //取出会导致英雄被删除
        System.out.println(ll);

    }

}
