/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayProblem;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author sumit
 */
public class RemoveDublicated {

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static int[] removedDublicatesThroughSet(int[] arr) { // O(n) timeComplexity
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int[] sets = new int[set.size()];
        int s = 0;
        for (Integer a : set) {
            sets[s++] = a;
        }
        return sets;
    }

    public static int[] removedDublicatesThroughMap(int[] arr) { // O(n) timeComplexity
        Map<Integer, Integer> setmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (setmap.containsKey(a)) {
                setmap.put(a, setmap.get(a) + 1);
            } else {
                setmap.put(a, 1);
            }
        }
        int[] sets = new int[setmap.size()];
        int s = 0;
        for (Integer a : setmap.keySet()) {
            if (setmap.get(a) == 1) {
                sets[s++] = a;
            }
        }
        

        return sets;
    }

    public static int[] removedDublicatesFromSorted(int[] arr) { // nlog(n) = timeComplexity
        int len = arr.length;
        int j = 0;
        int setArr[] = new int[len];
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                setArr[j++] = arr[i];
            }
        }
        setArr[j] = arr[len - 1];
        return setArr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 4, 4, 8, 8, 9, 12, 12};
        int[] removed = removedDublicatesFromSorted(arr);
        print(removed);
        int[] setRemoved = removedDublicatesThroughSet(arr);
        print(setRemoved);

        int[] singleOccurance = removedDublicatesThroughMap(arr); // single occurance also used for removed Dublicated .
        print(singleOccurance);
        
        ExecutorService ex=Executors.newCachedThreadPool();
    }
}
