// public class Pyramid {
//     public static void main(String[] args) {
//         // for(int i=1;i<=8;i++){
//         //     for(int j=1;j<=8-i;j++){
//         //         System.out.print(" ");

//         //     }
//         //     for(int j=1;j<=i;j++){
    //         //         System.out.print("*");
    //         //     System.out.println(" ");
    //         //     }
    // }
    

//         for(int i=5;i>=1;i--){
//             for(int j=1;j<=5-1;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1 ;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println(" ");

//         // for(int i=8;i>=1;i--){
//         //     for(int j=1;j<=8-i;j++){
//         //         System.out.print(" ");

//         //     }
//         //     for(int j=1;j<=i;j++){
//         //         System.out.print("*");
//         //     }
//         //     System.out.println(" ");
//         // }
//     }
    
// }
// }


public class HollowDiamond {
    public static void main(String[] args) {
        int n = 5; 

       
        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
           
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        
        for (int i = n - 1; i >= 1; i--) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
           
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

