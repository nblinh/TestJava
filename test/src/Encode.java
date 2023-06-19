public class Encode {
    public static void main(String args[]) {
        System.out.println(encode("aaaabcccaaa"));
    }

    public static String encode(String plainText){
        StringBuilder result = new StringBuilder("");
        int count=0;
        char ch=' ';
        for(int i=0;i<plainText.length();i++){
            if(i==0){
                count=1;
            }else{
                if(plainText.charAt(i)==ch){
                    count++;
                }else{
                    result.append(count).append(ch);
                    count=1;
                }
            }
            ch=plainText.charAt(i);
        }
        result.append(count).append(ch);
        return result.toString();
    }
}
