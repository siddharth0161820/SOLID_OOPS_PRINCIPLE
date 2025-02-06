package INTERFACESEGREGATIONPRINCIPLE;

public class PizzaClient implements PizzaAppInterfaceOffline {

//1>Method()--1
  public void acceptOrderOffine() {

  }
  //2>Method()--2
  public void acceptOnlyCash() {

  }
}
//NOTE:-Here client should not be forced to perform unnecessary functions..
//that violates I-Integration Segregation Principle.
//so better create new Interface and implement methods/functions() as per the need.
//create interface PizzaAppInterfaceOnline for implementing online order and so on....
