import java.util.HashSet;

public class testHashSet {
    public static void main(String args[]){
        HashSet s = new HashSet();
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        s.add(new Integer(1));
        s.add(new Integer(1));
        s.add(new Integer(2));

        System.out.println(a==b);
        System.out.println(s.size());
    }
}
