import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class GetTopStocks {

    public static void main(String args[]){
        String[] stocks = {"AMZN", "CACC", "EQIX", "GOOG", "ORLY"};
        float[][] prices = {{12.81f, 11.09f, 12.11f, 10.93f, 8.14f }, {10.34f, 10.56f, 10.14f, 12.17f, 9.34f}};
        String[] result = getTopStocks(stocks, prices);
        System.out.println(result[0] + " "+result[1] + " "+result[2]);
    }
    public static String[] getTopStocks(String[] stocks, float[][] prices) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");

        Map<Float, String> avgPrices = new TreeMap<>();
        float[] avgs = new float[stocks.length];
        for(int j=0;j<prices[0].length;j++){
            for(int i=0;i<prices.length;i++){
                avgs[j]+=prices[i][j];
            }
        }

        for(int i=0;i<stocks.length;i++){
            avgPrices.put(avgs[i]/prices.length, stocks[i]);
            avgs[i]=avgs[i]/prices.length;
        }
        Arrays.sort(avgs);
        return new String[] {avgPrices.get(avgs[stocks.length-1]), avgPrices.get(avgs[stocks.length-2]), avgPrices.get(avgs[stocks.length-3])};
    }
}
