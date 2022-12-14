package com.amigoscode;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        LinkedList<Person> LinkedList = new LinkedList<>();
        LinkedList.add(new Person("Alex", 21));
        LinkedList.add(new Person("Alexa", 21));
        LinkedList.addFirst(new Person("Ali", 18));

        ListIterator<Person> personListIterator = LinkedList.listIterator();
while (personListIterator.hasNext()){
    System.out.println(personListIterator.next());
}
        System.out.println();
while (personListIterator.hasPrevious()){
    System.out.println(personListIterator.previous());
}

    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Marian", 18));
        supermarket.add(new Person("Ali", 40));
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person (String name, int age){}
}
