package com.practice.javaeight;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp = new Employee("Bikash");
        emp.setId("1");
        emp.setMobile("9876543321");
        emp.setLastName("Roshan");
        emp.setFirstName("Bikash");
        emp.setSalary(218000D);
        employeeList.add(emp);
        Employee emp1 = new Employee("Alka");
        emp.setId("2");
        emp.setMobile("9876543321");
        emp.setLastName("Jeeya");
        emp.setFirstName("Alka");
        emp.setSalary(75000D);
        employeeList.add(emp1);

        Map<String,List<Employee>> map =
        groupBy(List.of(new Employee("Roshan")));
        System.out.println(map.toString());

        allInOne(employeeList);



    }

    private static Map<String, List<Employee>> groupBy(List<Employee> employeeList){
        return employeeList.stream().collect(Collectors.groupingBy(Employee::getFirstName));


    }

    private static void allInOne(List<Employee> employeeList){


        System.out.println(employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary)));

    }
}
