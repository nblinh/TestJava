public class Subsequences {
    public static void main(String args[]){
        String s1 = "HRW";
        String s2 = "HERHRWS";
        long count = getSubsequenceCount(s1, s2);
        System.out.println(count);
    }
    public static long getSubsequenceCount2(String s1, String s2) {
        // Write your code here
        long count = 0;
        for(int i=0;i<s2.length()-2;i++){
            if(s2.charAt(i)==s1.charAt(0)){
                for(int j=i+1;j<s2.length()-1;j++){
                    if(s2.charAt(j)==s1.charAt(1)){
                        for(int k = j+1;k<s2.length();k++){
                            if(s2.charAt(k)==s1.charAt(2)){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
    public static long getSubsequenceCount(String s1, String s2){
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        long count = 0;
        for(int i=0;i<chars2.length-2;i++){
            if(chars2[i]==chars1[0]){
                for(int j=i+1;j<chars2.length-1;j++){
                    if(chars2[j]==chars1[1]){
                        for(int k=j+1;k<chars2.length;k++){
                            if(chars2[k]==chars1[2]){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
