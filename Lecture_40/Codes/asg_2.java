import java.util.Arrays;
import java.util.Scanner;

public class asg_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int n = s.length();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        for (char c : arr) {
            System.out.print(c);
        }
    }
}
