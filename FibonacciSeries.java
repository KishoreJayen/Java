public class FibonacciSeries {
    public static void main(String[] args) {
        
        int n=10;
        int f =0;
        int s = 1;
        System.out.print(f+ " " +s);
        for(int i=3; i<=n; i++){
            int t = f+s;
            System.out.print(" " +t);
            f=s;
            s=t;
        }
    }
}
