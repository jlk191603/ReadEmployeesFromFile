package ru.systemsez.examples.readEmployeesFromFile;

public class Employee{
    private String fullName;
    private Integer yearOfBirth;
    private Double salary;

    public Employee(String fullName,Integer yearOfBirth, Double salary){
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }


    public String getFullName(){

        return fullName;
    }


    public void setFullName( String fullName ){

        this.fullName = fullName;
    }


    public Integer getYearOfBirth(){

        return yearOfBirth;
    }


    public void setYearOfBirth( Integer yearOfBirth ){

        this.yearOfBirth = yearOfBirth;
    }


    public Double getSalary(){

        return salary;
    }


    public void setSalary( Double salary ){

        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee{" + "fullName='" + fullName + '\'' + ", yearOfBirth=" + yearOfBirth +
               ", salary=" + salary + '}';
    }

}
