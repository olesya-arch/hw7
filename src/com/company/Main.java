package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("David", "Brown", Gender.MALE);
        Person p2 = new Person("Sam", "Ford", Gender.MALE);
        Person p3 = new Person("Tom", "Hardy", Gender.MALE);
        Person p4 = new Person("Sophie", "Evans", Gender.FEMALE);
        Person p5 = new Person("Judy", "Finch", Gender.FEMALE);
        Person p6 = new Person("July", "Ross", Gender.FEMALE);
        Person p7 = new Person("Tim", "Clark", Gender.MALE);
        Person p8 = new Person("Dan", "King", Gender.MALE);
        Person p9 = new Person("Dan", "King", Gender.MALE);
        Person p10 = new Person("July", "Ross", Gender.FEMALE);
        Person p11 = new Person("Harry", "James", Gender.MALE);
        Person p12 = new Person("Lilly", "Allen", Gender.FEMALE);
        Person p13 = new Person("Bruce", "Lee", Gender.MALE);
        Person p14 = new Person("Richard", "Jones", Gender.MALE);
        Person p15 = new Person("Tina", "Smith", Gender.FEMALE);


        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.size();

        outputCollection(persons);

        Set<Person> people = new HashSet<>();
        people.add(p6);
        people.add(p7);
        people.add(p8);
        people.add(p9);
        people.add(p10);
        people.size();

        outputCollection(people);

        Map<Integer, Person> person = new HashMap<>();
        person.put(1, p11);
        person.put(2, p12);
        person.put(3, p13);
        person.put(4, p14);
        person.put(5, p15);
        person.size();

        outputCollection(person);


    }

    public static void outputCollection(List<Person> list) {
        System.out.println("Вывод: ");
        for (Person person : list) {
            System.out.println(person + " ");
        }
        System.out.println("Общее количество элементов в коллекции - " + list.size());

    }

    public static void outputCollection(Set<Person> set) {
        System.out.println("Вывод: ");

        for (Person number : set) {
            System.out.println(number + " ");
        }

        System.out.println("Общее количество элементов в коллекции - " + set.size());
    }
    public static void outputCollection(Map<Integer, Person> map) {
        System.out.println("Вывод: ");
        for (Map.Entry<Integer, Person> keyValuePair : map.entrySet()) {
            System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
        }
        System.out.println("Общее количество элементов в коллекции - " + map.size());
    }

}


