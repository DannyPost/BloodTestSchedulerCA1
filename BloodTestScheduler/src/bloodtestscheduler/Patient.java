/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author bogda
 */
public class Patient {
    
    
    //declared variables
    private String name;
    private int age;
    private String priority;
    private boolean fromHospital;
    private String gpDetails;

    //constructor
    public Patient(String name, int age, String priority, boolean fromHospital, String gpDetails) {
        this.name = name;
        this.age = age;
        this.priority = priority.toLowerCase();
        this.fromHospital = fromHospital;
        this.gpDetails = gpDetails;
    }

    //Code Inspired from Oracle Documentation(https://docs.oracle.com/en/java/javase/17/language/switch-expressions-and-statements.html )
    //Original code:
    /*int numLetters = 0;
    Day day = Day.WEDNESDAY;
    switch (day) {
        case MONDAY, FRIDAY, SUNDAY -> numLetters = 6;
        case TUESDAY                -> numLetters = 7;
        case THURSDAY, SATURDAY     -> numLetters = 8;
        case WEDNESDAY              -> numLetters = 9;
        default -> throw new IllegalStateException("Invalid day: " + day);
    };
    System.out.println(numLetters);*/
    
    //calculates and returns the patient’s priority score as an integer
    public int getPriorityKey() {
        int baseKey = switch (priority) { //switch expression to assign a base priority score
            case "urgent" -> 300; //If priority is urgent assigns a base score of 300
            case "medium" -> 200; //If priority is medium assigns a base score of 200
            default -> 100; //for low or any other value it assigns a base score of 100
        };
        return baseKey + (fromHospital ? 50 : 0) + (age / 2); //adds 50 points if the patient is coming from a ward and then adds half the patient age
    }

    @Override
    public String toString() { // returns a String representation of this object
        return name + " (Age: " + age + ", Priority: " + priority + ", Hospital: " + fromHospital + ")";
    }
}


