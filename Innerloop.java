public class Innerloop {
    public static void main(String[] args) {
        
    //     for(int i=0; i<3; i++){
    //         for(int j=0; j<2; j++)
    //             System.out.println(i + " " + j);
    //             System.out.println();
    // }

    // for(int i=0; i<3; i++){
    //     for(int j=0; j<3;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
   
    for(int i=1; i<=7; i++){
        for(int j=1; j<=i; j++){ // for(int j=i; j<=i; j++)
            System.out.print(i); //* means print star */
        }
        System.out.println();
    }
    
//     for(int i=1; i<=3; i++){ 
//     for(int j=1; j<=3-i; j++){
//         System.out.print(" ");
//     }
//     for(int k=1; k<=i; k++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
}
}
