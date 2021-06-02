package com.alfa.task2;

public class Runner {

    public void run() {
        MyNumGenerator generator = new MyNumGenerator(10, 50);
        System.out.println(generator.generateList());
        MyNumGenerator generator1 =new MyNumGenerator(14, 15);
        System.out.println(generator1.generateSet());
    }
}
