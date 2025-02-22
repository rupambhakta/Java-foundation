import java.util.Arrays;
import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number you want to calculate: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + i + " number: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int res=arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] % arr[0] == 0) {
                int a = arr[i]/arr[0];
                res = res*a;
            }else{
                res=res*arr[i];
            }
        }
        System.out.println(res);
    }

}
