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
    void addPatient(String name, int age, String priority, boolean fromHospital, String gpDetails);
    Patient getNextPatient();
    void markNoShow(Patient patient);
    void displayNoShowPatients();
    void displayAllPatients();
}
