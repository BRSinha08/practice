package com.practice.javaeight;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRU {

    int capacity;
    LinkedList<Integer> list ;
    Set<Integer> set = new HashSet<>();
    public LRU(int capacity){
        list = new LinkedList<>();
        this.capacity =capacity;
    }

public void put(Integer v){

        if(list.size()==capacity){
            set.remove(list.getLast());
            list.removeLast();
        }
        /*if(set.contains(v)){
            set.remove(v);
        }*/
        set.add(v);
        list.addFirst(v);
}

public int get(Integer v){
      // Optional<Integer> optionalInteger = list.stream().filter(e->e.equals(v)).findFirst();
       if(set.contains(v)){
           list.remove(v);
           list.addFirst(v);
           return v;
       }
      /* if(optionalInteger.isPresent()){
           list.remove(v);
           list.addFirst(v);
           return optionalInteger.get();

       }*/
       return -1;
}

private LinkedList<Integer> getList(){
        return list;
}

    public static void main(String[] args) {
        LRU lru = new LRU(4);
        lru.put(1);
        lru.put(2);
        lru.put(3);
        lru.put(4);
        lru.put(5);
        lru.put(2);
        System.out.println(lru.getList());
        System.out.println(lru.get(1));
        System.out.println(lru.getList());

    }
}
