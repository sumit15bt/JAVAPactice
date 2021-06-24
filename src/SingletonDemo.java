/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sumit
 */
public class SingletonDemo {

    public static void main(String[] args) {
// instantiating Singleton class with variable x 
        SingeltonCheck x = SingeltonCheck.getInstance();

        // instantiating Singleton class with variable y 
        SingeltonCheck y = SingeltonCheck.getInstance();

        // instantiating Singleton class with variable z 
        SingeltonCheck z = SingeltonCheck.getInstance();

        // changing variable of instance x 
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // changing variable of instance z 
        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }

}
