package com.advancex.comparator_use;


public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("唐九夏", 23);
        people[1] = new Person("吉诺儿", 22);
        people[2] = new Person("卡缇娅", 21);

        PersonComparator personComparator = new PersonComparator();

        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (personComparator.compare(people[j], people[j + 1]) > 0) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
