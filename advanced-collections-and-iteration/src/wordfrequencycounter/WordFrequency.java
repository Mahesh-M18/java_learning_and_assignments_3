package wordfrequencycounter;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public void getFrequency(String[] words) {

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
