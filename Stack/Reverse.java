package Stack;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
    int[] arr= {1,2,3,78,8,51,0};

    Stack<Integer> stack = new Stack<>();
    for(int j : arr){
       stack.push(j);
    }
        for(int i=0; i<arr.length; i++){
            arr[i] =   stack.pop();
            System.err.print(" " + arr[i]);
        }
        
    }
}
