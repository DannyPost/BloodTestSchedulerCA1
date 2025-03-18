/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author bogda
 */
public interface PriorityQueueInterface {

    public void enqueue(int iKey, Object theElement); // adds new element to the priority queue
    public int size();
    public boolean isEmpty();
    public Object dequeue(); //removes and returns the element
    public void printPQueue();

}
