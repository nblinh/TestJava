public class AddDrama {

    public static void main(String args[]){
        System.out.println(addDrama("test!!erzera. sdfsdfds!!!!"));
    }
    public static String addDrama(String text) {
        // Write your code here
        var result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.') {
                result = result + "!";
            } else if (text.charAt(i) == '!' && ( i == text.length() - 1||text.charAt(i + 1) != '!')) {
                result = result + "!!";
            } else {
                result = result + text.charAt(i);
            }
        }

        return result;
    }
}
