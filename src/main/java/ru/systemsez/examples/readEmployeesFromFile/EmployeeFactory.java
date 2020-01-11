package ru.systemsez.examples.readEmployeesFromFile;


public class EmployeeFactory{

    public static Employee buildEmployee( String strEmployee){
        String[] arr = strEmployee.split( "," );
        String fullName = arr[0].trim();
        Integer year = Integer.parseInt( arr[1].trim() );
        Double salary = Double.parseDouble( arr[2].trim() );
        return new Employee( fullName, year, salary);
    }

}
