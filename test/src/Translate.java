public class Translate {
    public static void main(String args[]){
        String text = "hello new daay";
        System.out.println(translate(text));

    }

    public static boolean testVoyelle(char ch, char preCh){
        return((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')&&(preCh!='a'&&preCh!='e'&&preCh!='i'&&preCh!='o'&&preCh!='u'));
    }

    public static String translate(String text){
        StringBuilder result = new StringBuilder();
        char firstChar = text.charAt(0);

        if(firstChar=='a'||firstChar=='e'||firstChar=='i'||firstChar=='o'||firstChar=='u'){
            result.append("av"+firstChar);
        }else{
            result.append(firstChar);
        }
        for(int i=1;i<text.length();i++){
            if(testVoyelle(text.charAt(i), text.charAt(i-1))){
                result.append("av"+text.charAt(i));
            }else{
                result.append(text.charAt(i));
            }
        }
        return result.toString();
    }
}
