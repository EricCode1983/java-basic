package rank.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayOrLinkedDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Integer> arrList = new ArrayList();
        LinkedList<Integer> linList = new LinkedList();

        for (int i = 0; i < 10000; i++) {
            arrList.add(i);
            linList.add(i);
        }

        System.out.println("ArrayList访问消耗的时间：" + getTime(arrList));
        System.out.println("LinkedList访问消耗的时间：" + getTime(linList));

        System.out.println("\nArrayList插入消耗的时间：" + insertTime(arrList));
        System.out.println("LinkedList插入消耗的时间：" + insertTime(linList));

        System.out.println("\nArrayList删除消耗的时间：" + delTime(arrList));
        System.out.println("LinkedList删除消耗的时间：" + delTime(linList));

    }

    public static long getTime(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int index = Collections.binarySearch(list, list.get(i));
            if (index != i) {
                System.out.println("ERROR!");
            }
        }
        return System.currentTimeMillis() - time;
    }

    public static long insertTime(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(10, i); // 在索引为10的位置插入10万元素
        }
        return System.currentTimeMillis() - time;
    }

    public static long delTime(List list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.remove(i); // 在索引下，逐个删除所有元素
        }
        return System.currentTimeMillis() - time;
    }


}
