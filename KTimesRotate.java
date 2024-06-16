package Maths;

public class KTimesRotate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};   // Initial array
        int k =3; // Number of places to rotate

        // Save the first k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        
        // Shift elements to the left by k positions
        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }
        
        // Place the saved elements at the end
        for (int i = 0; i < k; i++) {
            arr[arr.length - k + i] = temp[i];
        }

        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
