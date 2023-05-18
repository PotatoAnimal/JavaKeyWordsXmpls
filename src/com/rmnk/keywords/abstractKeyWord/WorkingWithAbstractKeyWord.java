package com.rmnk.keywords.abstractKeyWord;

import java.util.Objects;

public class WorkingWithAbstractKeyWord {
    public static void main(String[] args) {
        //abstract classes is good to use when you want to
        //use polymorphism and make ur code more modern
        //to make a contract between father N child
        //N other

        Cat cat = new Cat(1, "Bus9");
        System.out.println(cat);
        System.out.println(cat.info());
        System.out.println(cat.info2());
    }

    static abstract class Animals {
        public String info() {
            return "Name";
        }

        public String info2() {
            return "info2";
        }
    }

    static class Cat extends Animals {
        private final int id;
        private final String name;

        @Override
        public String info() {
            return super.info() + " " + name;
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
}
