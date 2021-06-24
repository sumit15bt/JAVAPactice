/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author sumit
 */
public class CollectionsDemo {

    public static void main(String[] args) {

//        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
//        Hashtable<Integer,Integer> list = new Hashtable<>();
        List<Integer> list = new CopyOnWriteArrayList<>();
//        list.put(1,1);
//        list.put(2,1);
//        list.put(3,1);
//        list.put(5,1);
//        list.put(4,1);
//        list.add(56,56);
        list.add(null);
        list.add(97);
        list.add(11);
        list.add(2);
        list.add(45);
        list.add(31);
        list.add(51);
        list.add(81);
//        synchronized (list) {
////            Iterator lit=list.listIterator();
//        ListIterator lit = list.listIterator();// litIterator has more functionality
//        while (lit.hasNext()) {
//            System.out.print(lit.next() + " ");
//            list.add(111);
//        }
//        }
//        System.out.println(list.size());

//        System.out.println("");
//        System.out.println(Collections.binarySearch(list, 51));
//        System.out.println(Collections.max(list));
//        System.out.println("");
//        Collections.shuffle(list);
//        list.stream().forEach((l) -> {
//            System.out.print(l + " ");
//        });
        Enumeration<Integer> enumeration = Collections.enumeration(list);
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
            list.add(555);
        }
    }

}
