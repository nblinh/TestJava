import java.util.HashSet;
import java.util.Set;

public class Duodigit {
    public static void main(String args[]) {
        System.out.println(isDuodigit(Math.abs(-3333343)));

    }

    public static String isDuodigit(int number) {
        String str = Integer.toString(number);
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            characterSet.add(str.charAt(i));
        }
        return characterSet.size() > 2 ? "n" : "y";
    }
}
