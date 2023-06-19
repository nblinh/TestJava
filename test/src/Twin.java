import java.util.Arrays;

public class Twin {
    public static void main(String args[]){
        System.out.println(isTwin("Silent", "Listen"));

    }

    public static boolean isTwin(String a, String b) {
        char[] strA = a.toLowerCase().toCharArray();
        char[] strB = b.toLowerCase().toCharArray();
        Arrays.sort(strA);
        Arrays.sort(strB);
        return Arrays.equals(strA, strB);
    }
}
