package Lesson15.Task2;

import java.util.ArrayDeque;

public class Collection {
    private ArrayDeque<String> animals = new ArrayDeque<>();

    public void add(String animal){
        animals.addFirst(animal);
        System.out.println("added " + animal);
    }
    public void remove(){
        animals.removeLast();
        System.out.println("deleted last");
    }

    public void info(){
        System.out.println("Всего" + animals);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
