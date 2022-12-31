import java.util.Scanner;

public class problem_2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of arrays: ");

        System.out.println("Enter the size of 1st array: ");
        int n = scn.nextInt();
        
        System.out.println("Enter the size of 1st array: ");
        int m = scn.nextInt();

        int[] a = new int[n];

        int[] b = new int[m];
        
        System.out.println("Put value in 1st array: ");
        for (int i = 0; i < n; i++) {
            
            a[i] = scn.nextInt();
            
        }
        
        System.out.println("Put value in 2nd array: ");
        for (int i = 0; i < m; i++) {

            b[i] = scn.nextInt();

            boolean check = false;

            for (int j = 0; j < n; j++) {

                if (b[i] == a[j]) {

                    check = true;

                    break;

                }

            }

            if (!check) {

                System.out.println(b[i]);

            }

        }

    }

}
