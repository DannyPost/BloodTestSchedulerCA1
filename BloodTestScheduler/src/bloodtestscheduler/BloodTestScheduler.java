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
public class BloodTestScheduler implements SchedulerInterface{
    //declared varaibles
    private MyPriorityQueue patientQueue;
    private NoShowLinkedList noShowList;
    private ArrayList<Patient> allPatients;

    //constructor
    public BloodTestScheduler() {
        patientQueue = new MyPriorityQueue();
        noShowList = new NoShowLinkedList();
        allPatients = new ArrayList<>();
    }

/*   public NoShowLinkedList<Patient> getNoShowList() {
    return noShowList;
} */

    //Getter
    public NoShowLinkedList getNoShowList() {
        return noShowList;
    }
    
    
    //takes input parameters for all details of a patient
    // job is to create a Patient object and add them to priority queue and allPatientsList
    @Override
    public void addPatient(String name, int age, String priority, boolean fromHospital, String gpDetails) {
        Patient newPatient = new Patient(name, age, priority, fromHospital, gpDetails);
        patientQueue.enqueue(newPatient.getPriorityKey(), newPatient);
        allPatients.add(newPatient);
        System.out.println("Added: " + newPatient);
    }

    @Override
    public Patient getNextPatient() {
        //checks if the priority queue is empty
        if (patientQueue.isEmpty()) { 
            System.out.println("No patients in queue.");
            return null;
        }
        //removes the patient at the front of the priority queue
        return (Patient) patientQueue.dequeue();
    }

    @Override
    public void markNoShow(Patient patient) { //takes a Patient object as a parameter
        //checks that the provided patient object is not null
        if (patient != null) {
            noShowList.add(patient); //adds the patient to the noShowList
            System.out.println(patient + " marked as a no-show.");
        }
    }

    @Override
    public void displayNoShowPatients() {
        System.out.println("\nLast 5 No-Show Patients:");
        if (noShowList.isEmpty()) {
            System.out.println("No recorded no-shows.");
        } else {
            noShowList.printList(); //printList() method should print each patient in the list in the order they were added
        }
    }

    @Override
    public void displayAllPatients() {
        System.out.println("\nAll Patients:");
        //checks if the allPatients list is empty
        if (allPatients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            // loops through each Patient object and prints out their details
            for (Patient p : allPatients) {
                System.out.println(p);
            }
        }
    }
    
    
    public String getAllPatientsAsString() {
    StringBuilder sb = new StringBuilder();
    for (Patient p : allPatients) {
        sb.append(p.toString()).append("\n");
    }
    return sb.toString();
}
    
    
    public Patient findPatientByName(String name) {
    for (Patient p : allPatients) {
        if (p.getName().equalsIgnoreCase(name)) {
            return p;
        }
    }
    return null;
}
    
    
//Code Responsable in displaying no show patients
//Results in errors
/*public String getNoShowPatients() {
    StringBuilder sb = new StringBuilder();
    sb.append("Last 5 No-Show Patients:\n");
    for (Patient p : noShowList) {
        sb.append(p.toString()).append("\n");
    }
    return sb.toString();
}*/

   //Getters and Setters
    public MyPriorityQueue getPatientQueue() {
        return patientQueue;
    }

    public void setPatientQueue(MyPriorityQueue patientQueue) {
        this.patientQueue = patientQueue;
    }

    public ArrayList<Patient> getAllPatients() {
        return allPatients;
    }

    public void setAllPatients(ArrayList<Patient> allPatients) {
        this.allPatients = allPatients;
    }


}


