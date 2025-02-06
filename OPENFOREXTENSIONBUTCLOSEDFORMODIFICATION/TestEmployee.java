package OPENFOREXTENSIONBUTCLOSEDFORMODIFICATION;

public class TestEmployee {
    public static void main(String[] args) {
        //object for class Employee
        Employee employee=new Employee(101,"Siddharth");
        //Call/invoke the methods()
        employee.printMe();

        //object for TrainedEmployees
        TrainedEmployees trainedEmployees=new TrainedEmployees(101,"Siddharth","MahadevKeSang");
            trainedEmployees.printMe();
            trainedEmployees.printAreas();
    }
}
