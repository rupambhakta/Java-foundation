// import java.util.Scanner;

// public class rectangular_pattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         for (int i = 1; i <= r; i++) {
//             for (int j = 0; j <= c; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// //..................................................
import java.util.Scanner;

public class rectangular_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row:");
        int r = sc.nextInt();
        System.out.println("Enter Coloum:");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
}