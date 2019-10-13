package otherCollection;
/*
LinkDeList和双向链表Deque和队列queue

知识点:
    序列分先进先出FIFO和先进后出FILO
    FIFO在java中又叫Queue队列
    FILO在java中又叫Stack栈
 */

import com.yixianen.www.Hero;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class linkedListAndDeque2 {
    public static void main(String[] args) {
        //和ArrayList一样，LinkedList也实现了List接口
        List ll = new LinkedList<Hero>();
        //所不同的是LinkedList还实现了Deque，进而又实现了Queue这个接口
        //Queue代表FIFO先进先出的队列
        Queue<Hero> q= new LinkedList<Hero>();
        //加在队列的最后面
        System.out.println("初始化队列：\t");
        q.offer(new Hero("Hero1"));
        q.offer(new Hero("Hero2"));
        q.offer(new Hero("Hero3"));
        q.offer(new Hero("Hero4"));
        System.out.println(q);
        System.out.println("把第一个元素poll（）出来：\t");
        //取出第一个Hero，FIFO先进先出
        Hero h = q.poll();
        System.out.println(h);
        System.out.println("取出第一个元素之后的队列：\t");
        System.out.println(q);

        //把第一个拿出来看一看但是不取出来
        h=q.peek();
        System.out.println("查看第一个元素：\t" + h);



    }

}
