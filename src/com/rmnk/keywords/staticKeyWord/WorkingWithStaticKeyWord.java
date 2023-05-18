package com.rmnk.keywords.staticKeyWord;

public class WorkingWithStaticKeyWord {
    public static void main(String[] args) {
        //static make one single copy of member that gives u much easier access to members of that class
//        int a = 5; int b = 2;
//        Math math = null;
//        System.out.println(math.max(a, b));                                                     THIS
//        System.out.println(Math.max(a, b));                                THIS
        //be honest that use useful thinks from other classes much easier in      example than in     .


        Friends friends1 = new Friends("Sandy");
        Friends friends2 = new Friends("Dima");
        Friends friends3 = new Friends("Patrick");
        Friends friends4 = new Friends("Patrick");

        System.out.println(Friends.countOfFriends);

        Friends.infoFriends();
    }
}
