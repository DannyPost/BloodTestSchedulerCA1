/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author bogda
 */
public class NoShowLinkedList implements LinearListInterface{
    private class Node {
        
        //declaredd variables
        private Object element;
        private Node next;

        //constructor
        public Node(Object element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node head; //head is pointer to the first node in the linked list
    private int iSize; //keeps track of how many elements are currently stored in the linked list

    
    //constructor
    public NoShowLinkedList() {
        head = null;
        iSize = 0;
    }

    @Override
    public void add(Object element) {
        head = new Node(element, head); //creates a new Node that contains the element passed in
        iSize++; //increments iSize counter
        //If the size is bigger than 5 it removes the oldest patient
        if (iSize > 5) {
            removeLast();
        }
    }

    private void removeLast() {
        if (iSize == 0) return; //checks if list is empty
        if (iSize == 1) {
            head = null; //removing the last element means setting head to equal null
        } else { 
            Node curr = head; //pointer curr starting at the head
            while (curr.next.next != null) { //moves through the list until curr is pointing to the secondlast node
                curr = curr.next;
            }
            curr.next = null;
        }
        iSize--;
    }

    @Override
    public Object get(int position) {
        Node curr = head; // points to the start of the linked list
        // loop moves curr through the list until it reaches the node at the specified position
        for (int i = 1; i < position; i++) {
            curr = curr.next;
        }
        return curr.element;
    }

    //removes a node from the linked list at a specific position
    @Override
    public void remove(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 1; i < position - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        iSize--;
    }

    @Override
    public boolean isEmpty() {
        return iSize == 0; //iSize variable keeps track of the number of elements currently in the list
    }

    //tells how many elements are currently in the list
    @Override
    public int size() {
        return iSize;
    }

    //method prints out every element in the linked list in order
    @Override
    public void printList() {
        Node curr = head;
        while (curr != null) { //loop continues as long as curr is not null
            System.out.println(curr.element);
            curr = curr.next;
        }
    }
}


