package org.example.Stream;

import java.util.List;

public class stream_01 {

    private String firstName;
    private String lastName;
    private Double salary;
    private List<String> infor;

    public stream_01(String firstName, String lastName, Double salary, List<String> infor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.infor = infor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<String> getInfor() {
        return infor;
    }

    public void setInfor(List<String> infor) {
        this.infor = infor;
    }
}
