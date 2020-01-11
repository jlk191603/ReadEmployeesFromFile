package ru.systemsez.examples.readEmployeesFromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService{

    /**
     * Загрузка сотрудников из файла
     * @param pathToFile путь к файлу со списком сотрудников
     * @return список сотрудников
     */
    public static List<Employee> loadEmployees( String pathToFile){
        List<Employee> employees = null;
        try( FileReader inputStream = new FileReader( pathToFile );
             BufferedReader bufferedReader = new BufferedReader( inputStream )){
            employees = readEmployees(bufferedReader);
        }catch( IOException e ){
            e.printStackTrace();
        }
        return employees;
    }

    private static List<Employee> readEmployees(BufferedReader reader) throws IOException{
        List<Employee> employees = new ArrayList<>();
        String strEmployee;
        //Построчно читаем файл и создаем сотрудников
        while((strEmployee = reader.readLine()) != null) {
            employees.add(EmployeeFactory.buildEmployee(strEmployee));
        }
        return employees;
    }


    /**
     * Метод поиска по фамилии в заданном списке
     * @param employees общий список сотрудников в котором ищем
     * @param example фпмилия сотрудника
     * @return список подходящих сотрудников
     */
    public static List<Employee> findEmployeesByExample(List<Employee> employees, String example ){
        List<Employee> res = new ArrayList<>();
        for( Employee emp : employees){
            if(emp.getFullName().startsWith( example )){
                res.add(emp);
            }
        }
        return res;
    }
}
