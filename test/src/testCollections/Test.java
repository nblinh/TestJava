package testCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String args[]){
        CreditCard ccd1 = new CreditCard(1234);
        CreditCard ccd2 = new CreditCard(1234);

        List<CreditCard> cList = new ArrayList<CreditCard>();
        cList.add(ccd1);
        cList.add(ccd1);
        System.out.println("Location 1: "+ cList.size());

        Set<CreditCard> cSet = new HashSet<>();
        cSet.add(ccd1);
        cSet.add(ccd2);
        System.out.println("Location 2: "+ cSet.size());

        Set<CreditCard> cSet2 = new HashSet<>();
        cSet2.add(ccd1);
        cSet2.add(ccd1);
        System.out.println("Location 3: "+ cSet2.size());

        String str = "kayak";
        boolean result = IntStream.range(0, str.length()).allMatch((i-> {
            System.out.println(str.charAt(i) + "-"+str.charAt(str.length()-i-1));
            return str.charAt(i)==str.charAt(str.length()-i-1);
        }));

        System.out.println(result);

        boolean result2 = IntStream.range(0, str.length()/2).noneMatch((i-> {
            System.out.println(str.charAt(i) + "-"+str.charAt(str.length()-i-1));
            return str.charAt(i)!=str.charAt(str.length()-i-1);
        }));
        System.out.println(result2);

        boolean result3 = Stream.iterate(0, i->i+1).limit(str.length()).anyMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
        System.out.println(result3);

        Consumer<Integer> print = ( x) -> {};
    }
}
