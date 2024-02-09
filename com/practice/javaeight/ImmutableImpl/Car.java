package com.practice.javaeight.ImmutableImpl;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final List<String> nameList;
    public Car(List<String> nameList){
        this.nameList = nameList;
        List<String> clonedList = new ArrayList<>();
        clonedList.addAll(this.nameList);
    }
    public List<String> getNames(){
        List<String> clonedList = new ArrayList<>();
        clonedList.addAll(this.nameList);
        return clonedList;
    }
}

