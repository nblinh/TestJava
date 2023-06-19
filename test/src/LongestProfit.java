import java.util.Arrays;

public class LongestProfit {

    public static void main(String args[]) {
        System.out.println(longestProfit(new int[]{-1, 9, 0, 8, -5, 6, -24}));

    }

    public static int longestProfit(int[] data) {
        if (data == null || data.length == 0) {
            return 0;
        }
        int[] max = new int[data.length];
        Arrays.fill(max, 1);
        int result = 1;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < i; j++) {
                if (data[j] < data[i]) {
                    max[i] = Math.max(max[i], max[j] + 1);
                }
            }
            result = Math.max(result, max[i]);
        }
        return result;
    }
}
