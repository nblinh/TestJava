import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountFrequencies {

    public static void main(String args[]){
        String[] words = {"the", "dog", "get", "the", "bonne"};
        int[] result = countFrequencies(words);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] countFrequencies(String[] words) {
        Map<String, Integer> mapWords = new TreeMap<>();

        for (String word : words) {
            mapWords.merge(word, 1, Integer::sum);
            /*if (mapWords.containsKey(word)) {
                mapWords.put(word, mapWords.get(word) + 1);
            } else {
                mapWords.put(word, 1);
            }*/
        }

        return mapWords.values().stream().mapToInt(i -> i).toArray();
    }
}
