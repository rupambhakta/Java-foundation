import java.util.Scanner;

public class asg_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp = arr.clone();
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && temp[j] < temp[j - 1]) {
                int val = temp[j];
                temp[j] = temp[j - 1];
                temp[j - 1] = val;
                j--;
            }
        }
        int pos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] == temp[i]) {
                    arr[j] = pos;
                    pos++;
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}