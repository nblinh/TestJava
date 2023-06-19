import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stones {
    public static void main(String args[]){
        List<Integer> stones = new ArrayList<>(Arrays.asList(1, 1,2,3,3,2));
        System.out.println(magic(stones));
    }

    public static int magic(List<Integer> stones){
        if(stones==null||stones.isEmpty()) return 0;

        Collections.sort(stones);
        List<Integer> newStones = new ArrayList<>();
        while (newStones.size()<stones.size()) {
            for (int i = 0; i < stones.size(); i++) {
                if(i==stones.size()-1){
                    newStones.add(stones.get(i));
                }else{
                    if (stones.get(i) == stones.get(i + 1)) {
                        newStones.add(stones.get(i) + 1);
                        i++;
                    } else {
                        newStones.add(stones.get(i));
                    }
                }

            }
            if(newStones.size()<stones.size()){
                stones=newStones;
                newStones = new ArrayList<>();
            }

        }
        return newStones.size();
    }
}
