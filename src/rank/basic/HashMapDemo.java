package rank.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMapDemo {

    public static void main(String[] args) {
        //arrayListDemo();
        linklistDemo();
    }


    private static void arrayListDemo()
    {
        ArrayList <Integer> arrayList=new ArrayList<>();
        arrayList.add(5);
        //System.out.println( arrayList.get(0));
        arrayList.add(6);
        arrayList.set(1,9);


        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }


    private static void linklistDemo(){

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.remove(2);

        for (int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }

    }
}
