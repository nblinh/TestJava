import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ingredients {

    public static void main(String args[]){
        List<String> ingredients = Arrays.asList("2 eggs",
                "200 grams of flour",
                "150 grams of ",
                "1 liter(s) of milk");
        List<String> result = adjustQuantities(3, ingredients);
        System.out.println(result.toString());
    }
    public static List<String> adjustQuantities(int nbPersons, List<String> ingredients){
        List<String> result = new ArrayList<>();
        for(String str: ingredients){
            int quantite = Integer.parseInt(str.substring(0, str.indexOf(' ')));
            result.add(quantite*nbPersons + str.substring(str.indexOf(' '), str.length()));
        }
        return result;
    }
}
