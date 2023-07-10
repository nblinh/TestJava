import java.util.*;

public class Anagrams {
    public static void main(String args[]) {
        List<String> text = Arrays.asList("code", "doce", "ecod", "framer", "frame");
        List<String> text2 = Arrays.asList("code", "aaagmnrs", "anagrams", "doce");
        List<String> anagrams = funWithAnagrams(text2);
        Collections.sort(anagrams);
        for(String str: anagrams){
            System.out.println(str);
        }

    }

    public static List<String> funWithAnagrams(List<String> text){
        List<String> result = new ArrayList<>();
        List<String> sortedText = new ArrayList<>();
        for(String str: text){
            String sortedStr = sortString(str);
            if(!sortedText.contains(sortedStr)){
                sortedText.add(sortedStr);
                result.add(str);
            }
        }

        return result;
    }

    public static String sortString(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
