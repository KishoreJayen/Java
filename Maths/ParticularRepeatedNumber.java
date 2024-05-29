package Maths;
public record ParticularRepeatedNumber() {
    public static void main(String[] args) {
        int arr[] = {1, 5, 9, 8, 5, 1, 67, 5, 89, 9, 51, 1};
        int target= 5;
        int answer = repeatedNumber(arr, target);
        System.out.println(target + " Repeated Number of " + answer + " Times");
    }

    public static int repeatedNumber(int arr[] , int target){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            } 
        }
        return count;
    }
}
