package com.practice.javaeight;

import java.util.HashMap;

public class HashMapUsingObjectKey {

    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        HashMapKey hashMapKey = new HashMapKey(1,2);
        map.put(1,hashMapKey);
        map.put(2,hashMapKey);
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(2));

        HashMap<Employee, String> hm=new HashMap<Employee, String>();
        hm.put(new Employee("a"), "emp1");
        hm.put(new Employee("b"), "emp2");
        hm.put(new Employee("a"), "emp1 OVERRIDDEN");

        System.out.println("HashMap's data> "+hm);
        System.out.println("HashMap's size> "+hm.size());
        System.out.println(hm.get(new Employee("a")));
    }
}
