import java.util.Arrays;
import java.util.List;

public class Maximumtrailing {

    public static void main(String args[]){
        //int max = maxTrailing(Arrays.asList(2, 3, 10, 2, 4, 8, 1));
        int max2 = maxTrailing(Arrays.asList(7, 9, 5, 6, 3, 2));
        System.out.println(max2);
    }
    public static int maxTrailing(List<Integer> levels) {
        // Write your code here
        if(levels.size()==0) return -1;
        int max =-1;
        for(int i=1;i< levels.size();i++){
            for(int j=0;j<i;j++){
                int diff = levels.get(i) - levels.get(j);
                if(diff>max) max=diff;
            }
        }
        return max;
    }
}
