package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    private static Map<Integer, Employee> employeeMap;
    private static List<Employee> duplicatedEmployee;

    public static void main(String[] args) {
        /*List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"yusuf","koca"));
        employees.add(new Employee(1,"yusuf","koca"));
        employees.add(new Employee(1,"yusuf","koca"));
        employees.add(new Employee(2,"elif","kocaefe"));
        employees.add(new Employee(2,"elif","kocaefe"));
        employees.add(new Employee(3,"zeynep","korkmaz"));
        employees.add(new Employee(4,"levent","yoluaçık"));
        employees.add(new Employee(5,"ahu","serinyol"));
        employees.add(new Employee(6,"selim","hakimbey"));

        System.out.println(findDuplicates(employees));
        System.out.println(findUniques(employees));
        System.out.println(removeDuplicates(employees));*/

        System.out.println(WordCounter.calculatedWord());
    }


        public static List<Employee> findDuplicates(List<Employee> employees){
            employeeMap = new HashMap<>();
            duplicatedEmployee = new LinkedList<>();
            Iterator<Employee> iterator = employees.iterator();
            while (iterator.hasNext()){
                Employee employee = iterator.next();
                if(employee ==null){
                    System.out.println("Null record");
                    continue;
                }

                if(employeeMap.containsKey(employee.getId())) {
                    duplicatedEmployee.add(employee);
                } else{
                        employeeMap.put(employee.getId(),employee);
                    }
                }
                return duplicatedEmployee;
            }

            public static Map<Integer,Employee> findUniques(List<Employee> employees){
                employeeMap = new HashMap<>();
                Iterator<Employee> iterator = employees.iterator();
                while (iterator.hasNext()){
                    Employee employee = iterator.next();
                    if(employee ==null){
                        System.out.println("Null record");
                        continue;
                    }

                    if(!employeeMap.containsKey(employee.getId())) {
                        employeeMap.put(employee.getId(),employee);
                    }
                }
                return  employeeMap;

        }


        public static List<Employee> removeDuplicates(List<Employee> employees){
        List<Employee> dublicates = findDuplicates(employees);
        Map<Integer,Employee> uniques = findUniques(employees);
        List<Employee> onlyUnique = new LinkedList<>(uniques.values());
        onlyUnique.removeAll(dublicates);
        return onlyUnique;
        }


}