
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sumit
 */
class Node {

    int data;
    Node next;

    Node(int x) {
        this.data = x;
        next = null;
    }
}

public class TEST {

    static int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
    static int arr2[] = new int[]{2, 3, 8, 13};

    public static void merge(int m, int n) {

        for (int i = n - 1; i >= 0; i--) {
            int j, last = arr1[m - 1];
            for (j = m - 2; j >= 0 && arr1[j] > arr2[i]; j--) {
                arr1[j + 1] = arr1[j];
            }

            if (j != m - 2 || last > arr2[i]) {
                arr1[j + 1] = arr2[i];
                arr2[i] = last;
            }
        }
    }

    public static int longSubarrWthSumDivByK(int arr[], int n, int k) {
        int mod_arr[] = new int[n];
        int max = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += arr[i];
            mod_arr[i] = ((curr_sum % k) + k) % k;
            System.out.println("mod_arr[" + i + "] = " + mod_arr[i]);
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 6, 1, 4, 5};
        int n = arr.length;
        int k = 3;
        System.out.println("Length = "
                + longSubarrWthSumDivByK(arr, n, k));
//        merge(arr1.length, arr2.length);
//        System.out.print("After Merging nFirst Array: ");
//        System.out.println(Arrays.toString(arr1));
//        System.out.print("Second Array:  ");
//        System.out.println(Arrays.toString(arr2));
    }

}
