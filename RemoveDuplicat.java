public class RemoveDuplicat {
    public static void main(String[] args) {
        int[] arr= {1,1,98,98,1,4,5,7,8,10,7,6,8};
        boolean[] value = new boolean[arr.length];

        for(int i=0; i<=arr.length-1; i++){
            if(value[i]== false){
                for(int j=i+1; j<=arr.length-1; j++){
                    if(arr[i] ==arr[j]){
                        value[j]=true;
                    }
            }
            System.out.print(" " + arr[i]);
        }
    }
}
}
