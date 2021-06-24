/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 *
 * @author sumit
 */
public class Customer {

    private int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName()+" going to withdraw...");

        if (this.amount < amount) {
            System.out.println(Thread.currentThread().getName()+" Less balance; waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.amount -= amount;
        System.out.println(Thread.currentThread().getName()+" withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName()+" going to deposit..." + amount);
        this.amount += amount;
        System.out.println(Thread.currentThread().getName()+" deposit completed...! ");
        notifyAll();
    }

}
