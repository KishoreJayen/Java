package Maths;
import java.util.HashMap;

public class PairProgram {
    public static void main(String[] args) {
        int arr[] = {8, 7, 2, 5, 3, 1};
        int target = 10;
        pairSum(arr, target);
    }
    public static void  pairSum(int arr[] , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean pairFound = false;

            for(int i=0; i<arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                System.out.println("Pair found: (" + arr[i] + ", " + complement + ")");
                pairFound = true;
            }
            map.put(arr[i], i);
        }
        if (!pairFound) {  
         System.out.println("No pair found with the given sum.");
        }
    }
}
