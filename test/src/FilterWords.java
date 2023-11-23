import java.util.*;
import java.io.*;
import java.math.*;

class FilterWords {

    public static void main(String args[]){
        String[] words = {"the", "dog", "got", "a", "bone"};
        String letters = "ae";

        String[] results = filterWords(words, letters);
        for(String str: results){
            System.out.print(str +" ");
        }

    }

    public static String[] filterWords(String[] words, String letters) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            for (int i = 0; i < letters.length(); i++) {
                if (word.indexOf(letters.charAt(i)) > -1) {
                    result.add(word);
                    break;
                }
            }
        }

        return result.toArray(new String[result.size()]);
    }
}