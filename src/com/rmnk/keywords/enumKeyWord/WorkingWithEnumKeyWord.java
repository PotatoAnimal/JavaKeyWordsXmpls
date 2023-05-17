package com.rmnk.keywords.enumKeyWord;

public class WorkingWithEnumKeyWord {
    public static void main(String[] args) {
        Test test = new Test();
        Colors colors = Colors.BLACK;

        test.days(colors);
    }

    static class Test {
        void days(Colors colors) {
            switch (colors) {
                case BLACK:
                    System.out.println("Mondays are bad.");
                    break;
                case WHITE:
                    System.out.println("Fridays are better.");
                    break;
                case RED:
                    System.out.println("ye");
                    break;
                case YELLOW:
                    System.out.println("Weekends are best.");
                    break;
                default:
                    System.out.println("Midweek days are so-so.");
                    break;
            }
        }
    }
}
