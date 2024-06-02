package Maths;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {7,2,65,12,98};
        int target= 2;
        int result = binarySearch(arr, target);
        if (result != -1){
            System.err.println("Element found at the Index at: "+ result);
        }
        else{
             System.out.println("Element not found in the array");       
        }
    }
    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+ (end-start) /2;
            if(arr[mid] == target){
                return  mid;
            } if (arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
