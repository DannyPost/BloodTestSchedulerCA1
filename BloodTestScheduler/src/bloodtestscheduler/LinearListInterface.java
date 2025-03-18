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
    public void add(Object element);
    public Object get(int index);
    public void remove(int index);
    public boolean isEmpty();
    public int size();
    public void printList();
}
