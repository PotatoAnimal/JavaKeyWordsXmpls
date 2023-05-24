package com.rmnk.keywords.AAccessKeyWords.publicAccess;

import com.rmnk.keywords.AAccessKeyWords.publicAccess.publicPackegeOne.PublicOneClass;
import com.rmnk.keywords.AAccessKeyWords.publicAccess.publicPackegeTwo.PublicTwoClass;
import com.rmnk.keywords.AAccessKeyWords.publicAccess.publicPackegeTwo.publicPackegeTree.PublicTreeClass;

public class WorkingWithPublicKeyWord {
    //public keyword give us an opportunity to get access to
    //any variable which marked as public
    public static void main(String[] args) {
        PublicOneClass publicOneClass = new PublicOneClass();
        PublicTwoClass publicTwoClass = new PublicTwoClass();
        PublicTreeClass publicTreeClass = new PublicTreeClass();

        int age = publicOneClass.age;
        System.out.println(age);
        age = publicTwoClass.age;
        System.out.println(age);
        age = publicTreeClass.age;
        System.out.println(age);
    }
}
