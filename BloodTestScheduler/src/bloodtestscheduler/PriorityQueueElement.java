/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author bogda
 */

//class that holds two pieces of information for each item in the priority queue
public class PriorityQueueElement{
    
    //Code Inspired from class slides
    //Original Code:
    //public class PQElement{
        //private int iKey;
        //private Object element;
    
    //variables store the priority key (iKey) and the actual data that will be kept together in the priority queue
    private int iKey;
    private Object element;

    //Constructor
    public PriorityQueueElement(int iKey, Object element) {
        this.iKey = iKey;
        this.element = element;
    }

    //Getters/Setters
    public int getiKey() {
        return iKey;
    }

    public void setiKey(int iKey) {
        this.iKey = iKey;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    //overriding the default toString() method from the Object class.
    @Override 
    public String toString() {
        return element.toString() + " (Priority key: " + iKey + ")";
    }
}


