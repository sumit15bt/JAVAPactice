/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayProblem;

/**
 *
 * @author sumit
 */
public class UnionIntersection {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i++] + " ");
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j++] + " ");
            } else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
        while (i < arr1.length) {
            System.out.print(arr1[i++] + " ");
        }
        while (j < arr2.length) {
            System.out.print(arr2[j++] + " ");
        }
    }
}
