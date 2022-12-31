import java.util.Scanner;

public class problem_3 {
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int r = sc.nextInt();
        System.out.println("Enter colums number: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter " + r * c + " element in array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " no row element: ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(arr[i][j]!=arr[i-1][j-1]){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
