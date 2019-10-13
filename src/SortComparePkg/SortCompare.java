package SortComparePkg;
/*
冒泡排序法，选择排序法以及二叉树排序的性能区别
 */

import java.util.Arrays;

public class SortCompare {
    public static void main(String[] args) {
        //初始化随机数
        int total = 40000;
        System.out.println("初始化一个长度是"+ total + "的随机数组");
        int[] originalNumbers = new int[total];
        for (int i = 0; i < originalNumbers.length; i++) {
            originalNumbers[i] = (int) (Math.random()*total);
        }
        System.out.println("初始化完毕");
        System.out.println("用三种算法进行排序");
        //从初始化了的随机数组复制过来，以保证，每一种排序算法的目的是一样的
        int[] use4sort;
        use4sort = Arrays.copyOf(originalNumbers,originalNumbers.length);
        int[] sortedNumbersBySelection = performance(new SelectionSort(use4sort),"选择排序法");
        use4sort = Arrays.copyOf(originalNumbers,originalNumbers.length);
        int[] sortedNumbersByBubbling=performance(new BubblingSort(use4sort),"冒泡排序法");
        use4sort = Arrays.copyOf(originalNumbers,originalNumbers.length);
        int[] sortedNumbersByTree=performance(new TreeSort(use4sort),"二叉树排序法");
        System.out.println("查看排序结果，是否是不同的数组对象");
        System.out.println(sortedNumbersBySelection);
        System.out.println(sortedNumbersByBubbling);
        System.out.println(sortedNumbersByTree);
        System.out.println("查看排序结果、内容是否相同");
        System.out.println("比较选择排序和冒泡排序的结果");
        System.out.println(Arrays.equals(sortedNumbersBySelection,sortedNumbersByBubbling));
        System.out.println("比较选择排序和二叉树排序的结果");
        System.out.println(Arrays.equals(sortedNumbersBySelection,sortedNumbersByTree));

    }


    public static int[] performance(Sort algorithm, String type) {
        long start = System.currentTimeMillis();
        algorithm.sort();
        int sortedNumbers[] = algorithm.values();
        long end = System.currentTimeMillis();
        System.out.printf("%s排序，耗时 %d 毫秒 %n",type,end-start);
        return sortedNumbers;
    }
}
