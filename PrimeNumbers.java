public class PrimeNumbers {
    
    public static void main(String[] args) {
        int n=11;
        if(isPrime(n)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
