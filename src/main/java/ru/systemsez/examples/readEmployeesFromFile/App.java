package ru.systemsez.examples.readEmployeesFromFile;

import java.util.List;
import java.util.Scanner;

public class App{
    public static void main(String[]args){
        List<Employee> employees = EmployeeService.loadEmployees( "E:/employees.txt" );

        while(true){
            System.out.print( "Введите фамилию:" );
            Scanner scanner = new Scanner( System.in );
            String str = scanner.next();

            //для выхода из программы пишем "exit"
            if( str.equals( "exit" ) ){
                return;
            }

            List<Employee> employeeListResult = EmployeeService.findEmployeesByExample( employees, str );
            Double sumSalary = 0.0;
            for( Employee emp : employeeListResult ){
                System.out.println( emp.getFullName() + "\t| " + emp.getSalary() );
                sumSalary += emp.getSalary();
            }

            System.out.println( "=========================================" );
            System.out.println( "сумма по найденным сотрудникам: " + sumSalary );
            System.out.println( "=========================================\n" );

        }
    }
}
