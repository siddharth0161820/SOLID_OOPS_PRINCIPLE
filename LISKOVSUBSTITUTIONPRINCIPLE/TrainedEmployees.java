package LISKOVSUBSTITUTIONPRINCIPLE;

//Extending the class Employee Here...
public class TrainedEmployees extends Employee {
//1> Attributes
    private String trainingAreas;

    //1> Parameterized constructor
    public TrainedEmployees(int id, String name, String trainingAreas) {
        super(id, name);
        this.trainingAreas=trainingAreas;
    }




}
