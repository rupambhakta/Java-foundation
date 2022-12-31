import java.util.Scanner;

public class find_x {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4, 5, 3, 5, 6, 8, 5, 1 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find in array : ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println(x + " present in the array " + count + " time.");
    }
}
