package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        String[] cars = {"Toyota", "Honda", "Tesla", "BMW", "Audi"};
        /*for (String car : cars) {
            list1.add(car);
        }*/
        list1.addAll(Arrays.asList(cars));

        ArrayList<String> list2 = new ArrayList<>(list1);
        for (String s : list1) {
            System.out.println(s);
        }
        System.out.println("=".repeat(30));

        ArrayList<String> list3 = new ArrayList<>(list2);
        Collections.sort(list3);
        for (String s : list3) {
            System.out.println(s);
        }
        System.out.println("=".repeat(30));

        Iterator<String> iter = list3.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
            if (iter.hasNext())
                iter.next();
                iter.remove();
        }
        System.out.println("=".repeat(30));

        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Orange");
        set1.addAll(list1);
        set1.addAll(list2);

        for (String s : set1) {
            System.out.println(s);
        }
        System.out.println("=".repeat(30));

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.addAll(list2);
        set2.addAll(list3);

        for (String s : set2) {
            System.out.println(s);
        }

        System.out.println("=".repeat(30));

        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "Январь");
        map1.put(2, "Февраль");
        map1.put(3, "Март");
        map1.put(4, "Апрель");
        map1.put(5, "Май");
        map1.put(6, "Июнь");
        map1.put(7, "Июль");
        map1.put(8, "Август");
        map1.put(9, "Сентябрь");
        map1.put(10, "Октябрь");
        map1.put(11, "Ноябрь");
        map1.put(12, "Декабрь");

        System.out.println(map1.get(1) + "  " + map1.get(12));
        map1.replace(6, "ОТПУСК");


        System.out.println("=".repeat(30));

        HashMap<Integer, String> map2 = new HashMap<>(map1);
        result(map1);
        result(map2);


        HashMap<String, Set<String>> map3 = new HashMap<>();
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("0996904587");
        hash_Set.add("qwerty@gmail.com");
        hash_Set.add("student_435");
        Set<String> data = hash_Set;

        map3.put("Oleg", data);
        for (Map.Entry<String, Set<String>> item : map3.entrySet()) {
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue());
        }

        System.out.println("=".repeat(30));

    }
    public static void result(HashMap maps) {
        Set keys = maps.keySet();
        Collection values = maps.values();
        System.out.println(keys);
        System.out.println(values);
    }


}
