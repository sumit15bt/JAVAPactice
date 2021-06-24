/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

import java.util.Scanner;

/**
 *
 * @author sumit
 */
public class ThreadCommunication {

    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread("withdrawl Thread 1") {
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        
        new Thread("withdrawl Thread 2") {
            public void run() {
                c.withdraw(25000);
            }
        }.start();
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 1) {
            new Thread("deposit Thread 1") {
                public void run() {
                    c.deposit(35000);
                }
            }.start();
        } 

    }

}
