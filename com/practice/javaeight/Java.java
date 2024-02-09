package com.practice.javaeight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Java {

  //  @Autwired EmployeeRepository employeeRepository;

    //crate a list of numbers, using stream get the numbers starting 1


    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(10,13,24,56,87,105,23);
        list.stream().filter(s->s.toString().startsWith("1"))
                .forEach(System.out::println);

        /*employeeRepository.findById();
        employeeRepository.findAll();*/

        HashMap<Integer, Employee> hm = new HashMap<>();
        hm.put(1,new Employee("sjfahs"));
        hm.put(2,new Employee("afhf"));
        hm.put(3,new Employee("d    ew"));
        System.out.println(hm.get(1));
        System.out.println(hm.get(2));




    }

    public void find(List<Integer> list){

       //return  list.stream().map(s->s+"").
        // filter(s->s.startsWith("1")).collect(Collectors.toList())




    }



}
