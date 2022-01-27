package com.sparta.oop;

public class Employee extends Person{

    private String departmentName;
    private double salary;


    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Employee(){
        super();
    }

    @Override
    public void delete() {

    }

    @Override
    public String toString(){
        return "Employee{" + "departmentName='" + departmentName + '\'' +
                " salary=" + salary + "} " + super.toString();
    }


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }









}
