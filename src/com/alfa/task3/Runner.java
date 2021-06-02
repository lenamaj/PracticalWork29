package com.alfa.task3;

import java.util.HashMap;

public class Runner {

    public void run(){

        MyTranslator tr = new MyTranslator(new HashMap<>());
        tr.addWords("congested", "перенаселённый");
        tr.addWords("noticed","заметил");
        tr.addWords("misusing","злоупотребляет");
        tr.addWords("sluggish","вялый");
        tr.addWords("supposed","предпологать");
        tr.addWords("relatively","относительно");
       String sentence = "He noticed that she misusing her responsibility";
        System.out.println(tr.translate(sentence));


    }
}
