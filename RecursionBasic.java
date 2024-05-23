public class RecursionBasic {
    public static void main(String[] args) {
      int n=5;
      System.out.println(recursiveMethod(n));
    }
    public static int recursiveMethod(int n){
       if(n==0)return 1;
       return n* recursiveMethod(n-1); 
    }
}


// System.out.println("Raj");
//  recursiveMethod(n-1);