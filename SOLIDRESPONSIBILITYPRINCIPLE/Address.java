package SOLIDRESPONSIBILITYPRINCIPLE;

public class Address {
    //1> Attributes
    private String second;
    private String state;
    private String city;
    //now we can easily use Address class here withut
    // violating single responsibility principle--s
    Address address;

    //2> Getter and setter
    public String getSecond() {
        return second;
    }
    public void setSecond(String second) {
        this.second = second;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
