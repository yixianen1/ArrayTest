package otherCollection;

import com.yixianen.www.Hero;

import java.util.LinkedList;

public class MyStack implements Stack {
    //创建一个LinkedList对象
    LinkedList<Hero> ll = new LinkedList<>();

    //将英雄推入到最后位置
    @Override
    public void push(Hero h) {
        //将每次传入的对象都添加到链表的尾部
        ll.addLast(h);
    }

    //把最后一个英雄取出来
    @Override
    public Hero pull() {
        //删除链表的尾部并返回
        return ll.removeLast();
    }

    @Override
    public Hero peek() {
        //查看链表的尾部并返回
        return ll.getLast();
    }

    @Override
    public String toString() {
        return ll.toString();
    }

    public static void main(String[] args) {
        //创建MyStack对象
        MyStack ms = new MyStack();
        //往MyStack对象中添加英雄
        ms.push(new Hero("hero1"));
        ms.push(new Hero("hero2"));
        ms.push(new Hero("hero3"));
        ms.push(new Hero("hero4"));
        ms.push(new Hero("hero5"));
        System.out.println("MyStack中的英雄顺序为：" + ms);
        System.out.println("MyStack中的最后一个英雄为：" + ms.peek());
        //取出最后一个英雄
        for (int i = 0; i < 5; i++) {
            Hero h = ms.pull();
            System.out.println(h);
        }

    }
}
