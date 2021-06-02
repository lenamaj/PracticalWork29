package com.alfa.task2;

import java.util.*;

public class MyNumGenerator {

    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public int getNumOfElm() {
        return numOfElm;
    }
    public void setNumOfElm(int numOfElm) {
        this.numOfElm = numOfElm;
    }
    public int getMaxNumb() {
        return maxNumb;
    }
    public void setMaxNumb(int maxNumb) {
        this.maxNumb = maxNumb;
    }


    public List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numOfElm; i++) {
            list.add(((int) (Math.random() * maxNumb)));
        }
        return list;
    }

    public Set<Integer> generateSet() {

        if (Math.abs(maxNumb) < numOfElm)
            throw new IllegalArgumentException("Max number cannot be smaller then range");
        Set<Integer> set = new TreeSet<>();
        while (set.size() <= numOfElm) {
            set.add(((int) (Math.random() * maxNumb)));
        }
            return set;

        }
    }



