package com.practice.javaeight;

import java.util.HashSet;
import java.util.Objects;

public class SetCustom {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Name1");
        Student s2 = new Student(1, "Name1");
        HashSet<Student> set = new HashSet<>();
       // s2=s1;
        set.add (s1);
        set.add (s2);

        System.out.println(set);

    }
}
    class Student{
        @Override
        public String toString() {
            return "Student{" +
                    "rollno=" + rollno +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if(this ==obj){
                return true;
            }
            if(getClass()!=obj.getClass()){
                return false;
            }
            if(this.rollno == rollno){
                return true;
            }
            return false;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result =1;
            result = prime* rollno+name.hashCode();
            return result;
        }

        int rollno;
        String name;

        Student(int rollno,String name){
            this.rollno =rollno;
            this.name = name;
        }

    }

