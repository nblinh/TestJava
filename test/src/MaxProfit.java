public class MaxProfit {
    public static void main(String args[]) {
        int[] data = new int[]{-1, 9, 0, 8, -5, 6, -24};
        int[] result = maxProfit(data);

        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] maxProfit(int[] data) {
        int x = 0;
        int y = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += data[k];
                }
                if (max < sum) {
                    x = i;
                    y = j;
                    max = sum;
                }
            }
        }

        return new int[]{x, y};
    }
}
