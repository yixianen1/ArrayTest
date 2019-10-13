package otherCollection;
/*
二叉树概念：
    二叉树由各种节点组成
    二叉树特点：
        每个节点都可以有左子节点，右子节点
        每一个节点都有一个值

 加入通过二叉树对如下10个随机数进行排序
 67,7,30,73,10,0.78，81,10,74
 排序的第一个步骤是吧数据插入到该二叉树中
 插入的基本逻辑是，小、相同的放左边，大的放右边
 1.67放在根节点
 2.7比67小，放在67的左节点
 3.30比67小，找到67的左节点7,30比7大，就放在7的右节点
 4.73比67大，放在67的右节点
 5.10比67小，找到67的左节点7,10比7大，找到7的右节点30,10比30小，放在30的左节点
 .....
一定注意：相同的也放左边
 */

import java.util.ArrayList;
import java.util.List;

public class Node {
    //左子节点
    public Node leftNode;
    //右子节点
    public Node rightNode;
    //值
    public Object value;

    //插入数据
    public void add(Object v) {
        //如果当前节点没有值，就把数据放在当前节点上
        if (null == value) {
            value = v;

            //如果当前节点有值，就进行判断，新增的值与当前值得大小关系
        } else {
            //新增的值，比当前值小或者相同
            if ((Integer) v - ((Integer) value) <= 0) {
                if (null == leftNode) {
                    leftNode = new Node();
                }
                leftNode.add(v);
            } else {
                //新增的值  比当前值大
                if (null == rightNode) {
                    rightNode = new Node();
                }
                rightNode.add(v);
            }
        }
    }

    //中序遍历所有节点
    public List<Object> values() {
        List<Object> values = new ArrayList<>();
        //左节点的遍历结果
        if (null != leftNode) {
            values.addAll(leftNode.values());
        }
        //当前节点
        values.add(value);
        //右节点的遍历结果
        if (null != rightNode) {
            values.addAll(rightNode.values());
        }
        return values;
    }

    public static void main(String[] args) {
        int randoms[] = new int[]{67, 7, 30, 73, 10, 0, 78, 81, 10, 74};
        Node roots = new Node();
        for (int number :
                randoms) {
            roots.add(number);
        }
        System.out.println(roots.values());
    }

}
