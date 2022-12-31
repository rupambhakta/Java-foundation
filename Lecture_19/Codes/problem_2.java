import java.util.Scanner;

public class problem_2 {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("put values onthe array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " no element: ");
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        int present_1 = 0;
        int present_0 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                present_1++;
            } else {
                present_0++;
            }
        }
        if (present_1 > present_0) {
            System.out.println("The lenth is " + (present_0 * 2));
        } else if (present_1 < present_0) {
            System.out.println(present_1 * 2);
        }else if(present_1==present_0){
            System.out.println(present_1+present_0);
        } 
        else {
            System.out.println("-1");
        }
    }
}
