/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import Test.Test;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


/**
 *
 * @author sumit
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        SinglyLinkedList List = new SinglyLinkedList(); 
  
        // Adding data to the list 
        List.addNode(9); 
        List.addNode(1); 
        List.addNode(1); 
        List.addNode(3); 
        List.addNode(4); 
        List.addNode(8); 
        List.addNode(2); 
        List.addNode(1); 
      
        List.printLinkedList();
          System.out.println("removed dublicates composition  "); 
        List.removeDublicated();
         List.printLinkedList();
    }

    private static void shuffle(String[] str) {
        Random ran=new Random();
        for(int i=0;i<str.length;i++){
            int index=ran.nextInt(i+1);
//            System.out.print("index -> "+index);
            String s=str[index];
            str[index]=str[i];
            str[i]=s;
        }
    }

}
