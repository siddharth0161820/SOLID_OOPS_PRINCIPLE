package SOLIDRESPONSIBILITYPRINCIPLE;

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
                "Employee Name is "+this.name);
    }
}
//NOTE:-WE NEED TO MODIFY FEW MORE EMPLOYEE DETAILS LIKE ADDRESS,
//2> SO WE NEED TO CREATE MORE CLASSES AS
//3> SINGLE RESPONSIBILITY PRINCIPLE SHOULD HAVE ONLY ONE RESPONSIBILITY PRINCIPLE.