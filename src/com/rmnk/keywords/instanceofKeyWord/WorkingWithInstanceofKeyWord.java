package com.rmnk.keywords.instanceofKeyWord;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class WorkingWithInstanceofKeyWord {
    public static void main(String[] args) {
        //Here u`ll get to known how to sort in lists by Class
        //different ways to add object into list
        //how instanceof works in IF statement
        //why do u need to know stream API`s N how can u use it with instanceof in ur code

        Cat cat = new Cat(1, "Bus9");
        cat.voice();
        Dog dog = new Dog(1, "Buy");
        dog.voice();

        if (dog instanceof Animals) {
            System.out.println("true");         //true
        }

        System.out.println("============================================================================================");

        Animals animals1 = new Cat(2, "Murzik");
        Animals animals2 = new Dog(2, "Richik");
        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(cat);
        animalsList.add(dog);
        animalsList.add(animals1);
        animalsList.add(animals2);
        animalsList.add(new Dog(3, "Bob"));
        animalsList.add(new Cat(3, "Liza"));
        System.out.println(animalsList);

        System.out.println("============================================================================================");

        List<Animals> colectedCats = animalsList.stream().filter(c -> c instanceof Cat).toList();
        System.out.println(colectedCats);

        for (Animals cats : colectedCats){
            cats.voice();
        }
    }

    static class Animals {
        String name;

        public void voice() {
            System.out.println("meow");
        }
    }

    static final class Cat extends Animals {
        private final int id;
        private final String name;

        @Override
        public void voice() {
            System.out.println(id + " Cat " + name + " says: " + "MEOW!!!");
        }

        Cat(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int id() {
            return id;
        }

        public String name() {
            return name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (Cat) obj;
            return this.id == that.id &&
                    Objects.equals(this.name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "Cat[" +
                    "id=" + id + ", " +
                    "name=" + name + ']';
        }
    }

    static final class Dog extends Animals {
        private final int id;
        private final String name;

        @Override
        public void voice() {
            System.out.println(id + " Dog " + name + " says: " + "BARK-BARK!!!");
        }

        Dog(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int id() {
            return id;
        }

        public String name() {
            return name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (Dog) obj;
            return this.id == that.id &&
                    Objects.equals(this.name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return "Dog[" +
                    "id=" + id + ", " +
                    "name=" + name + ']';
        }
    }

}
