/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author bogda
 */
public interface LinearListInterface {
    public void add(Object element); //adds a new object to the head of the linked list
    public Object get(int index); //retrieves and returns the element stored at a index in the linked list
    public void remove(int index); //will remove the patient from the noshow linked list at the given index position
    public boolean isEmpty(); //checks if a data structure contains any elements
    public int size(); //returns the number of elements stored in a data structure
    public void printList();
}
