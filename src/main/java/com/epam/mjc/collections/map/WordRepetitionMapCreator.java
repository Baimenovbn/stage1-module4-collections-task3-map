package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.split(" ");
        HashMap<String, Integer> wordRepetitionQuantity = new HashMap<>();

        if (!sentence.isEmpty()) {
            for (String word: words) {
                String formatted = word.trim().replaceAll("[.,:-]", "").toLowerCase();

                if (wordRepetitionQuantity.containsKey(formatted)) {
                    wordRepetitionQuantity.put(formatted, wordRepetitionQuantity.get(formatted) + 1);
                } else {
                    wordRepetitionQuantity.put(formatted, 1);
                }
            }
        }

        return wordRepetitionQuantity;
    }
}
