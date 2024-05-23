package ListCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListBasic {
    public static void main(String[] args) {
        
        int[] arr = {7,8,9,54,78,124,78,2,1};

        List <Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        list.remove(4);

        int [] arr1 = new int[list.size()];
        for(int i=0; i<list.size(); i++){
           arr1[i]= list.get(i);
        }
        System.out.println(Arrays.toString(arr1));
    }
}
