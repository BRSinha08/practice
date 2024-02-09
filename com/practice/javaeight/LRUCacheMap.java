package com.practice.javaeight;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Optional;

public class LRUCacheMap {

    int capacity;
    LinkedList<Integer> list ;
    Map<Integer, Integer> map = new LinkedHashMap<>();
    public LRUCacheMap(int capacity){
        list = new LinkedList<>();
        this.capacity =capacity;
    }

    public void put(Integer k,Integer v){

        if(list.size()==capacity){
            Optional<Integer> key = map.entrySet().stream().filter(e->e.getValue().
                    equals(list.getLast())).map(Map.Entry::getKey).findFirst();
            key.ifPresent(k1 -> map.remove(k1));

           // map.remove(k);
           // set.remove(list.getLast());
            list.removeLast();
        }
        /*if(set.contains(v)){
            set.remove(v);
        }*/
        //set.add(v);
        map.put(k,v);
        list.addFirst(v);
    }

    public int get(Integer k){
            if(map.containsKey(k)){
            list.remove(map.get(k));
            list.addFirst(map.get(k));
            return map.get(k);
        }
        return -1;
    }

    private LinkedList<Integer> getList(){
        return list;
    }

    public static void main(String[] args) {
        LRUCacheMap lru = new LRUCacheMap(2);
        lru.put(2,1);
        lru.put(1,1);
        System.out.println(lru.get(2));
        System.out.println(lru.getList());
        lru.put(4,1);
        System.out.println(lru.get(1));
        System.out.println(lru.getList());
        System.out.println(lru.get(2));
        System.out.println(lru.getList());
        /*lru.put(5,5);
        lru.put(2,2);
        System.out.println(lru.getList());
        System.out.println(lru.get(1));
        System.out.println(lru.getList());
        System.out.println(lru.get(5));
        System.out.println(lru.getList());*/

    }
}
