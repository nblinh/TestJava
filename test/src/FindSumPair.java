public class FindSumPair {
    public static void main(String args[]) {
        int[] numbers = new int[]{1,2, 5, 8, 1, 2};
        int[] result = findSumPair(numbers, 13);
        System.out.println(result[0]+", "+ result[1]);

    }

    public static int[] findSumPair(int[] numbers, int k) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == k) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}
