public class AVTransalate {

    public static String translate(String text) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        StringBuilder str = new StringBuilder();

        for(int i=0;i<text.length();i++){
            if(check(text.charAt(i)) &&(i==0||!check(text.charAt(i-1)))){
                str.append("av");
            }
            str.append(text.charAt(i));
        }
        return str.toString();
    }

    public static boolean check(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}
