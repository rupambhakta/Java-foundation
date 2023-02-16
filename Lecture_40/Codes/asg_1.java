import java.util.Scanner;

public class asg_1 {
    static void sort(String arr[]) {
        int n = arr.length;
        int minIndex;
        for (int i = 0; i < n; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[i]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many string you want to input: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " no string: ");
            arr[i] = sc.next();
        }
        sort(arr);
        System.out.println("Sorted string is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
