package Maths;

public class Reverse {
public static void main(String[] args) {
    int n=  121;
    int rev =0;
    int dup=n;
    while(n>0){
        int result = n%10;
        rev = rev*10+ result;
        n=n/10;
    } 
    if(rev==dup){
        System.out.println("It is palindrome");
    }else{
        System.out.println("Not a Palindrome");
    }
   


    // String str= "7789";
    // String str2="";
    // StringBuffer reverse = new StringBuffer(str);
    // str2 += reverse.reverse();
    // System.out.println(str2);

//     int arr[] = {22,28,34,39,40,45};

//    int i=arr.length-1;
//    while(i>=0){
//     System.out.print(" " +arr[i]);
//     i--;
//    }
}  
}