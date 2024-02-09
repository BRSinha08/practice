package com.practice.javaeight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    List<Employee> sort(List<Employee> employeeList){
        Comparator<Employee> sortByFirstName = (e1, e2)->e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
        Comparator<Employee> sortByLastName = (e1, e2)-> e1.getLastName().compareToIgnoreCase(e2.getLastName());
        Comparator<Employee> sortBySalary = Comparator.comparingDouble(Employee::getSalary);
        return employeeList.stream().sorted(sortByFirstName.thenComparing(sortByLastName).
                thenComparing(sortBySalary)).collect(Collectors.toList());
    }

    List<Employee> addEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        for(int i = 0; i<10;i++) {
            Employee employee = new Employee("cdc");
            employee.setId("001" +i);
            employee.setFirstName("Roshan" +i);
            employee.setLastName("Bikash" +i);
            employee.setMobile("8789403764" +i);
            employee.setSalary(567987.0+i);
            employeeList.add(employee);
        }
        Employee employee = new Employee("");
        employee.setId(null);
        employee.setFirstName("Roshan");
        employee.setLastName("Bikash");
        employee.setMobile("8789403764");
        employee.setSalary(567987.0);
        employeeList.add(employee);
        return employeeList;
    }

    public static List<Integer>test(){
        List<Integer>list = new ArrayList<>();
        try{
            list.add(2);
            return list;
        }
        finally {
            list.add(3);
            return list;
        }

    }
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        List<Employee> employeeList =sorting.sort(sorting.addEmployees());
        employeeList.forEach(e-> System.out.println(e.getFirstName()+" "+e.getLastName()+
                " "+e.getId()+" "+ e.getSalary()+" "+e.getMobile()));

        System.out.println(test());
    }
}
