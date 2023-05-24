package com.rmnk.keywords.AAccessKeyWords.protectedAccess;

import com.rmnk.keywords.AAccessKeyWords.protectedAccess.protectedOne.ProtectedClassOne;
import com.rmnk.keywords.AAccessKeyWords.protectedAccess.protectedTwo.ProtectedClassTwo;
import com.rmnk.keywords.AAccessKeyWords.protectedAccess.protectedTwo.protectedTree.ProtectedClassTree;

public class WorkingWithProtectedKeyWord {
    //protected keyword let u see variables only inside one single package
    //not in packages up or down

    public static void main(String[] args) {
        ProtectedClassOne protectedClassOne = new ProtectedClassOne();
        ProtectedClassTwo protectedClassTwo = new ProtectedClassTwo();
        ProtectedClassTree protectedClassTree = new ProtectedClassTree();

        //not working
//        protectedClassOne.age;
//        protectedClassTwo.age;
//        protectedClassTree.age;
    }
}
