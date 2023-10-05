package testString;

public class StringEquals {
    public static void main(String args[]){
        String str="java";
        String str1 = new String("java");

        
        System.out.print(str.equals(str1));
        System.out.print(" ");
        System.out.print(str == str1);
        System.out.print(" ");
        System.out.print(str.compareTo(str1));
        //another comment
    }
}
