package Maths;
public class Armstrong {
    
    public static void main(String[] args) {
       int num=1634; 
       int result=0;
       int temp=num;
       while(num>0){
        int sum = num%10;
        result += Math.pow(sum, 3);
        num=num/10;
       }
       if(temp==result){
        System.out.println("It is Armstrong");
       }else{
        System.out.println("Not a Armstrong");
       }
       
    }
}
