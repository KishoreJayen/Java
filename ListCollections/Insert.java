package ListCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Insert {
    public static void main(String[] args) {
        
        int[] arr = {7, 8, 9, 4, 5, 6, 7, 89, 587};
        int insertElement = 10;
        int indexPosition = 5;
     
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            list.add(i);
        }  
        list.add(indexPosition, insertElement);
        int[] arr1 = new int [list.size()];
        for(int i=0; i<list.size(); i++){
            arr1[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr1));
    }
}
