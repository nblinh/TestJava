package testCollections;

import java.util.HashMap;
import java.util.Map;

public class Country {
    public static void main(String args[]){
        Map<String, String> map = new HashMap<>();

        map.put("US", "United States");
        map.put("US", "USA");
        map.put("IND", "India");
        map.put(null, "France");
        System.out.println(map.size());

        try {
            for(Map.Entry<String, String> output1: map.entrySet()){
                map.remove("USD");
                System.exit(0);
            }
        }
        finally {
            System.out.println("Infinally");
        }
    }
}
