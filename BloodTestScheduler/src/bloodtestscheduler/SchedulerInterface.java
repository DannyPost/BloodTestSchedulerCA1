/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author bogda
 */
public interface SchedulerInterface {
    void addPatient(String name, int age, String priority, boolean fromHospital, String gpDetails); //creates new patient with the details
    Patient getNextPatient(); //removes and returns next patient from priority queue
    void markNoShow(Patient patient); //marks patient who did not show
    void displayNoShowPatients(); // shows a list of the last 5 patients who were marked as noshows
    void displayAllPatients(); //prints list of every patient
}
