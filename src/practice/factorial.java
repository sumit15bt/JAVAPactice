/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sumit
 */
public class factorial {

    public static void main(String[] args) {
//        System.out.println(findNth(10000021409l));
        System.out.println(findNth(22l));
    }
//10000021409

    public static long findNth(long N) {
        long ans = 0;
        long mul = 1;

        while (N != 0) {
            long dig = N % 9;
            ans = ans + (mul * dig);
            mul = mul * 10;
            System.out.println("mul =" + mul);
            
            N = N / 9;
        }
        return ans;
    }
}
