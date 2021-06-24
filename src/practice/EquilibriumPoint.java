/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author sumit
 */
public class EquilibriumPoint {

    public static void main(String[] args) {
        int arr[] = {63, 70, 80, 33, 33, 47, 20};
        int n = arr.length;
        int maxInRest = 0;
        int maxIndex = 0;
        ArrayList<Integer> res = new ArrayList();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            flag = true;
            if (arr[i] >= maxInRest || i > maxIndex) {
                for (int r = i + 1; r < n; r++) {
                    if (arr[i] < arr[r]) {
                        flag = false;
                        maxIndex = r;
                        maxInRest = arr[r];
                        break;
                    }
                }
            } else {
                flag = false;
            }
            if (flag && !res.contains(arr[i])) {
                res.add(arr[i]);
            }
        }
        System.out.println(res.size());
        res.forEach((r) -> {
            System.out.println(r);
        });
    }
}
