package com.alfa.task3;

import java.util.HashMap;

public class MyTranslator {

    HashMap<String, String> vocabulary;

    public MyTranslator(HashMap<String, String> vocabulary) {
        this.vocabulary = vocabulary;
    }

    public void addWords(String world, String translate){
        vocabulary.put(world, translate);
    }

    public String translate(String sentence){
        String[] word = sentence.split(" ");
        String translate = "";

        for (int i = 0; i < word.length; i++) {

            if(vocabulary.containsKey(word[i])){
                translate += vocabulary.get(word[i])+" ";
            } else translate +=null+" ";

        }
        return translate;
    }
}
