package com.practice.javaeight;

public class Employee {

    String firstName;
    String lastName;
    String id;
    String mobile;

    Double salary;

    public Employee(String firstName){
        this.firstName = firstName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public int hashCode(){

        return 1;
    }

    @Override
    public boolean equals(Object obj){
        return false;
    }

    @Override
    public String toString(){
        return "Employee[name="+firstName+"]";
    }

}
