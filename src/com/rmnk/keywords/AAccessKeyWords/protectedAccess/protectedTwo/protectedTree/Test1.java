package com.rmnk.keywords.AAccessKeyWords.protectedAccess.protectedTwo.protectedTree;

import com.rmnk.keywords.AAccessKeyWords.protectedAccess.protectedOne.ProtectedClassOne;
import com.rmnk.keywords.AAccessKeyWords.protectedAccess.protectedTwo.ProtectedClassTwo;

public class Test1 {
    public static void main(String[] args) {
        ProtectedClassTree protectedClassTree = new ProtectedClassTree();
        ProtectedClassOne protectedClassOne = new ProtectedClassOne();
        ProtectedClassTwo protectedClassTwo = new ProtectedClassTwo();
        int age = protectedClassTree.age;
        System.out.println(age);

//        not working
//        age = protectedClassTwo.age;
//        age = protectedClassOne.age;
    }
}
