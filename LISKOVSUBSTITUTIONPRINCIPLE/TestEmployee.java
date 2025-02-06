package LISKOVSUBSTITUTIONPRINCIPLE;

public class TestEmployee {

    //Method()--1
    public void useMe(Employee e){
       e.printMe();

    }
    public static void main(String[] args) {
        //object for class Employee
        Employee employee=new Employee(101,"Siddharth");
        //Call/invoke the methods()
        employee.printMe();


        //////////////////////////////
        //object for TestEmployee class
        TestEmployee testEmployee =new TestEmployee();
        testEmployee.useMe(employee);

    }



}
