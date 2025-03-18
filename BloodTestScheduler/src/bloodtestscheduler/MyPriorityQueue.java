/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;
import java.util.ArrayList;


/**
 *
 * @author bogda
 */

//priority queue is used to store and manage patients who are waiting for their blood test in order of importance
public class MyPriorityQueue implements PriorityQueueInterface {

    //ArrayList stores all the elements of priority queue.
    private ArrayList<PriorityQueueElement> thePQueue;

    //constructor
    public MyPriorityQueue() {
        thePQueue = new ArrayList<>();
    }

    
    //Decided to use Override methods
    //According to GeeksforGeeks:
    
    //code inspired from class example(MyPriorityQueue.java), original code:
    /*public void enqueue(int iKey, Object inElement) {
    PQElement newElement = new PQElement(iKey, inElement);
    int pos = findInsertPosition(iKey);
    thePQueue.add(pos, newElement);
    }*/
    
    /*"Overriding in Java occurs when a subclass implements a method which is already defined in the superclass or Base Class."*/
    //So I decided to use Override methods
    @Override //overriding a method defined in the PriorityQueueInterface
    public void enqueue(int iKey, Object inElement) { //accepts iKey and an object
        PriorityQueueElement newElement = new PriorityQueueElement(iKey, inElement); //creates a new queue element holding both the key and the patient object
        int pos = findInsertPosition(iKey); //finds correct position in the ArrayList where this element should be put
        thePQueue.add(pos, newElement); //inserts the new element into the queue at the correct position
    }

    //Code used from class example:
    /*public Object dequeue() {
    if (isEmpty())
        return null;
    return thePQueue.remove(0).getElement();
    }*/
    
    @Override //overriding method from the PriorityQueueInterface
    //returns the object with the highest priority from the queue
    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        return thePQueue.remove(0).getElement(); //removes element at the front and retrieves the Patient object from the PriorityQueueElement and returns it
    }

    @Override
    public int size() {
        return thePQueue.size(); //will return the number of elements currently in the priority queue
    }

    @Override
    public boolean isEmpty() {
        return thePQueue.isEmpty(); //will return true if the priority queue is empty or false otherwise
    }

    @Override
    //method that prints all the elements currently in the queue
    public void printPQueue() {
        for (PriorityQueueElement elem : thePQueue) { //for-each loop to go through each element stored in the queue
            System.out.println(elem);
        }
    }

    //method that finds the correct position in the queue to insert a new element with the given key
    private int findInsertPosition(int iKey) {
        int pos = 0; //checking from the front of the queue
        //loops through the queue as long as it hasn't reached the end and the new key is smaller than the current element’s key
        while (pos < thePQueue.size() && iKey < thePQueue.get(pos).getiKey()) {
            pos++; //moves to the next position in the queue
        }
        return pos; //returns the position where the new element should be inserted
    }
}


