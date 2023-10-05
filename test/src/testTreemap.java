import java.util.TreeMap;

public class testTreemap {
    public static void main(String args[]){
        TreeMap t = new TreeMap();
        t.put(3,3);
        t.put(2,1);
        t.put(1,2);

        System.out.println(t.values());
    }
}
