import java.util.*;

public class BinarySearch {
    public static void main(String[] args){
        int[] ints = {-9, 14, 37, 102};
        System.out.println(BinarySearch.exists(ints, 102));
        System.out.println(BinarySearch.exists(ints, 36));
    }
    public static boolean exists(int[] ints, int k) {

        return search(ints, 0, ints.length-1, k);
    }

    static boolean search(int[] ints, int first, int last, int k){
        if(first<=last){
            int mid = first + (last-first)/2;
            if(ints[mid]==k){
                return true;
            }else if(k < ints[mid]){
                return search(ints, first, mid-1, k);
            }else {
                return search(ints, mid+1, last, k);
            }
        }else{
            return false;
        }
    }
}