import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch2 {
    public static boolean exists(int[] ints, int k) {
        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
        return list.contains(k);
    }


}