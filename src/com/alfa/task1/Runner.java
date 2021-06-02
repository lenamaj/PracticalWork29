package com.alfa.task1;

import java.util.*;

public class Runner {

    public void run() {

        List<String> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add("number" + i);
        }
        System.out.println(myList);

        List<String> myLinkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * i);
            myLinkedList.add(index,"num" + i);
        }
//        for (String s : myLinkedList) {
//            int index = (int) (Math.random() * 10); //i
//            myLinkedList.set(index, s);//i
//        }
        System.out.println(myLinkedList);

        ListIterator<String> itrAr = myList.listIterator(10);
        ListIterator<String> itrLi = myLinkedList.listIterator(0);
//        while (itrAr.hasPrevious()) {
//            if (itrAr.previousIndex() % 2 != 0) {
//                itrLi.next();
//                itrLi.set(itrAr.previous());
//            }
//            itrLi.next();
//            itrAr.previous();
//        }

        do{
            itrLi.next();
            itrLi.add(itrAr.previous());
        } while (itrAr.hasPrevious());

        System.out.println(myLinkedList);

    }
}
