package ListCollections;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        Integer [] arr = {7, 8, 9, 4, 5, 6, 7, 89, 587};

        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);

        Integer [] arr2 = list.toArray( new Integer[0]);
        for(int i: arr2){
            System.out.print(" " + i);
        }
    }
}
