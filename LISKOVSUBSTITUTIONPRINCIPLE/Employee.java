package LISKOVSUBSTITUTIONPRINCIPLE;
//Employee class open for extension but closed for modification
public class Employee {
    //1> Attributes
    private int id;
    private String name;

    //2> Parameterized Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //3> Method()--1
    public void printMe(){
        System.out.println("Employee ID is "+this.id+
                " Employee Name is "+this.name);
    }
}
