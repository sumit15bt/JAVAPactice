/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author sumit
 */
public class MultiThreading {

    private static void printList(List<?> list) {
        synchronized (list) {
            System.out.println(Thread.currentThread().getName() +" =========> ");
            list.stream().forEach((l) -> {
//                System.out.println(Thread.currentThread().getName() + " => " + l);
                System.out.print(l + " ");
            });
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(56);
        list.add(97);
        list.add(11);
        list.add(2);
        list.add(45);
        list.add(31);
        list.add(51);
        list.add(81);
        
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printList(list);
            }
        }, "thread_1");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Collections.shuffle(list);
                printList(list);
            }
        }, "thread_2");
        thread1.start();
        thread2.start();
    }
}
