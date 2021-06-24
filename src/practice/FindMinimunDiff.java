/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;

/**
 *
 * @author sumit
 */
public class FindMinimunDiff {

    public static void main(String[] args) {
        int arr[] =  {14, 5, 61, 10, 21, 12, 54};
        int N = arr.length;
        int K = 4;
          System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
      
        
        int left = 0, right = N - 1;
        for (int i = 0; i < K; i++) {

            if (arr[right - 1] - arr[left] < arr[right] - arr[left + 1]) {
                right--;
            } else {
                left++;
            }
        }
          System.out.println(Arrays.toString(arr));
        System.out.println(arr[right]-arr[left]);
    }
}
