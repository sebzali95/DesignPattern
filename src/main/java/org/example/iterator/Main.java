package org.example.iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruit = new ArrayList<>();
        //new CopyOnWriteArrayList
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("orange");

        Iterator<String> iterator = fruit.iterator();
        while (iterator.hasNext()) {
            String fruits = iterator.next();
            System.out.println(fruits);
            fruit.remove("apple");
        }
        }
    }

