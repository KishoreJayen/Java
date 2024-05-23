package ListCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Removedup {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 4, 5, 6, 7, 89, 587, 4, 9, 6};
         int[] uniqueArray = removeDuplicate(arr);
         System.out.println(Arrays.toString(uniqueArray));
    }
    public static int[] removeDuplicate(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int[] arr2 = new int[ set.size()];
        int i = 0;
        for(int j: set){
            arr2[i++] = j;
        }
        return arr2 ;
    }
}
