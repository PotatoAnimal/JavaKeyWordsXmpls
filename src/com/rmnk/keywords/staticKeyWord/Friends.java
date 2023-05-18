package com.rmnk.keywords.staticKeyWord;

public class Friends {
    private String name;
    static int countOfFriends;

    Friends (String name){
        this.name = name;
        countOfFriends++;
    }
    public static void infoFriends (){
        System.out.println("There is " + countOfFriends + " friends u have!");
    }
}
