/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author sumit
 */
public class LeadGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();
        sc.nextLine();
        List<String[]> roundsScore = new ArrayList<>();
        while (rounds > 0) {
            String[] scores = null;
            scores = sc.nextLine().split(" ");
            roundsScore.add(scores);
            rounds--;
        }
        Integer t1cf=0, t2cf=0;
        for (String[] score : roundsScore) {
            t1cf+=JSType.toInteger(score[0]);
            t2cf+=JSType.toInteger(score[1]);
        }
        if(t1cf>t2cf)
            System.out.println("1 "+(t1cf-t2cf));
        else
            System.out.println("2 "+(t2cf-t1cf));

    }
}
