package Maths;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {5,8,24,6,74};
        int target = 24;
        int result = linearSearch(arr, target);
        if(result == -1){
            System.out.println("Element not found in the array");
            } else {
                System.out.println("Element found at index " + result);
            }
    }
    public static int linearSearch(int arr[] , int target){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
