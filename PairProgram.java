package Maths;
import java.util.Arrays;
// import java.util.HashMap;

public class PairProgram {
    public static void main(String[] args) {
       int arr[] =  {8, 7, 2, 5, 3, 1};
       int target = 10;
       pairSum(arr, target);
    }

     static void pairSum(int arr[] , int target) {
        Arrays.sort(arr);
        int left =0;
        int right= arr.length-1;
        Boolean pairFound = false;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.err.println("Pairs Found: " + "(" +arr[left] + "," + arr[right] + ")");
                pairFound = true;
                left ++;
                right--;
            }else if  (sum < target){
                left++;
            }
            else{
                right --;
            }
            }
        if(!pairFound){
            System.err.println("Pair Not Found");
        }
     }
}
















// int arr[] = {8, 7, 2, 5, 3, 1};
// int target = 10;
// pairSum(arr, target);
// }
// public static void pairSum(int arr[] , int target){
// HashMap<Integer,Integer> map = new HashMap<>();
// boolean pairFound = false;

//     for(int i=0; i<arr.length; i++){
//     int complement = target - arr[i];
//     if(map.containsKey(complement)){
//         System.out.println("Pair found: (" + arr[i] + ", " + complement + ")");
//         pairFound = true;
//     }
//     map.put(arr[i], i);
// }
// if (!pairFound) {  
//  System.out.println("No pair found with the given sum.");
// }