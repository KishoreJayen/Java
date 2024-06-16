package Maths;

public class ArryaConcat {
    public static void main(String[] args) {
        
        int[] a = {10,20,30};
        int[]  b= {40,50};
        int[] c= {60};

        int len = a.length + b.length + c.length;
        int [] d = new int[len];
        int index=0;
        for(int i=0; i<a.length; i++){
            d[index] = a[i];
            index++;
        }
        for(int i=0; i<b.length; i++){
            d[index] = b[i];
            index++;
        }
        for(int i=0; i<c.length; i++){
            d[index] =c[i];
            index++;
        }
        for(int i=0; i<d.length; i++){
            System.err.print(" " +d[i]);
        }
        // System.arraycopy(c, index, d, index, len);   instead of we use the arraycopy it is easy and simplify the code.
    }
}
