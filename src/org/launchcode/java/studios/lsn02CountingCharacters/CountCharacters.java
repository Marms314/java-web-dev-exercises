package org.launchcode.java.studios.lsn02CountingCharacters;

import java.util.HashMap;

public class CountCharacters {
    public static void main(String[] args) {
        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has" +
                " to be zero to start with. So if you move all the terms over to one side, you can put the quadratics" +
                " into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done" +
                " that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> charactersUsed = new HashMap<>();


        for (Character letter : sentence.toCharArray()) {
            if (letter.toString().matches("[a-zA-Z]")) {
                if (charactersUsed.containsKey(letter)) {
                    charactersUsed.put(letter, charactersUsed.get(letter) + 1);
                } else {
                    charactersUsed.put(letter, 1);
                }
            }
        }

        System.out.println(charactersUsed);
    }
}
