import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ComputeTotalPriceMacaron {

    public static void main(String args[]){
        float unitPrice = 4f;
        String[] macarons1 = {"Vanilla", "Banana", "Apple", "Cherry", "Peach", "Banana"};
        String[] macarons2 = {"Vanilla", "Apple", "Vanilla", "Apple"};
        String[] macarons3 = {"Peach", "Apple", "Peach", "Vanilla"};

        System.out.println(computeTotalPrice(unitPrice, macarons3));
    }
    public static int computeTotalPrice(float unitPrice, String[] macarons){
        Map<String, Integer> flavors = new HashMap<>();

        for(String macaron: macarons){
            flavors.merge(macaron, 1, Integer::sum);
        }
        int count = Collections.min(flavors.values());
        float price = switch(flavors.size()){
            case 5 -> 5*unitPrice*0.6f*count + (macarons.length-5*count)*unitPrice;
            case 4 -> 4*unitPrice*0.7f*count + (macarons.length-4*count)*unitPrice;
            case 3 -> 3*unitPrice*0.8f*count + (macarons.length-3*count)*unitPrice;
            case 2 -> 2*unitPrice*0.9f*count + (macarons.length-2*count)*unitPrice;
            case 1 -> (macarons.length*unitPrice);
            default -> 0f;
        };

        return (int)Math.floor(price);
    }
}
