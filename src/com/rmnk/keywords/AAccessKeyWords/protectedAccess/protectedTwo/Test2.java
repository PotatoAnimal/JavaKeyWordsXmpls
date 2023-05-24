package com.rmnk.keywords.AAccessKeyWords.protectedAccess.protectedTwo;

import com.rmnk.keywords.AAccessKeyWords.protectedAccess.protectedOne.ProtectedClassOne;
import com.rmnk.keywords.AAccessKeyWords.protectedAccess.protectedTwo.protectedTree.ProtectedClassTree;

public class Test2 {
    public static void main(String[] args) {
        ProtectedClassTree protectedClassTree = new ProtectedClassTree();
        ProtectedClassOne protectedClassOne = new ProtectedClassOne();
        ProtectedClassTwo protectedClassTwo = new ProtectedClassTwo();
        int age = protectedClassTwo.age;
        System.out.println(age);

        //not working
//        age = protectedClassOne.age;
//        age = protectedClassTree.age;
    }
}
