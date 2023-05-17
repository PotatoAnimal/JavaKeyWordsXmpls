package com.rmnk.keywords.enumKeyWord;

public class WorkingWithEnumKeyWord {
    public static void main(String[] args) {
        Colors day = Colors.BLACK;
            Test test = new Test();
            test.dayIsLike(day);
        }
        record Test (){
            public void dayIsLike (Colors day) {
                switch (day) {
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
