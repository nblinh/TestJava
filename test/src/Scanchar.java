import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scanchar {

    public static void main(String args[]){
        String art = "A";
        System.out.println(scanChar(art));
    }
    static char scanChar(String s){
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(s);
        if(matcher.find()){
            return s.charAt(0);
        }else{
            return '?';
        }

    }
}
