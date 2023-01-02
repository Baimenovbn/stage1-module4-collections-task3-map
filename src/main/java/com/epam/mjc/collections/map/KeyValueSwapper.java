package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String, Integer> swapped = new HashMap<>();

        for (Map.Entry<Integer, String> entry: sourceMap.entrySet()) {
            String shouldBeKey = entry.getValue();
            int shouldBeValue = entry.getKey();

            if (swapped.containsKey(shouldBeKey)) {
                int swappedValue = swapped.get(shouldBeKey);

                if (shouldBeValue < swappedValue) {
                    swapped.put(entry.getValue(), shouldBeValue);
                }
            } else {
                swapped.put(shouldBeKey, shouldBeValue);
            }
        }

        return swapped;
    }
}
