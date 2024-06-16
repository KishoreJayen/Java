package Maths;

public class FindMissingNumber {
    
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,60};
        int missingNumber = findMissingNumber(arr);
        System.out.println("The Missing Number is: " + missingNumber);
    }
    
   
    static int findMissingNumber(int[] arr){
        int n = arr.length+1;
        int first = arr[0];
        int last = arr[arr.length-1];
        int sum = n*(first+last) /2;

        int actualTotal = 0;
        for(int num : arr){
            actualTotal += num;
        }
        return sum - actualTotal;
    }
    }

