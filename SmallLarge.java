public class SmallLarge {
    
    public static void main(String[] args) {
        int arr[] =   {3, 2, 1, 56, 10000, 167};
        int[] result = greatSmall(arr);
        System.out.println("The Greatest Number is: " + result[0]);
         System.out.println("The Smallest Number is: " + result[1]); 
      }
      
      static int[] greatSmall(int [] arr){
          int small = Integer.MAX_VALUE;
          int large = Integer.MIN_VALUE;
          for(int i=0; i<arr.length; i++){
              if(arr[i] <small ){
                  small = arr[i];
              } 
              if(arr[i] >large){
                  large =arr[i];
              }
              }
              return new int[]{large,small};
          }
      }
  

