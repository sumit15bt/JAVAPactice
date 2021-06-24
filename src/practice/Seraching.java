/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.util.Arrays;

/**
 *
 * @author sumit
 */
public class Seraching {

    private static int binarySerach(int arr[], int l, int r, int x) {
        if (r >= 1) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySerach(arr, l, mid - 1, x);
            }
            return binarySerach(arr, mid + 1, r, x);
        }
        return -1;
    }

    private static int linearSerachRecursive(int arr[], int l, int r, int x) {
        if (r < l) {
            return -1;
        }
        if (arr[l] == x) {
            return l;
        }
        if (arr[r] == x) {
            return r;
        }
        return linearSerachRecursive(arr, l, r - 1, x);
    }

    private static int interpolationSearch(int arr[], int lo, int hi, int x) {
        while (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
            if (lo == hi) {
                if (arr[lo] == x) {
                    return lo;
                }
            }
            int position = lo + ((hi - lo) / (arr[hi] - arr[lo])) * (x - arr[lo]);
            if (arr[position] == x) {
                return position;
            } else if (arr[position] < x) {
                lo = position + 1;
            } else {
                hi = position - 1;
            }
        }
         return -1;
    }

    public static void main(String[] args) {

        int arr[] = {14, 5, 61, 10, 21, 12, 54};
        int N = arr.length;
        int serach = 61;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        binarySerach(arr, 0, N, serach);
        linearSerachRecursive(arr, 0, N, serach);
    }
}
