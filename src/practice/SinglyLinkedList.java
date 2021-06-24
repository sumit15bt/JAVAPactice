/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author sumit
 */
public class SinglyLinkedList {

    Node head = null;
    Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printLinkedList() {
        Node currentnode = head;
        if (head == null) {
            System.out.println("Empty linkedList");
            return;
        } else {
            while (currentnode != null) {
                System.out.print("node info " + currentnode.info +" ");
                currentnode = currentnode.next;
            }
        }
    }

    void removeDublicated() {
        Node current = head;
        Node index = null, temp = null;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                temp = current;
                index = current.next;
                while (index != null) {
                    if (current.info == index.info) {
                        temp.next=index.next;
                    } else {
                        temp=index;
                    }
                    index=index.next;
                }
                 current = current.next; 
            }
        }
    }
}
