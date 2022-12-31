import java.util.Scanner;

public class duplicate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Found "+arr[i]);
                    break;
                }
            }
        }
        // int dup = arr[0];
        // for (int i = 1; i < n; i++) {
        //     dup ^= arr[i];
        // }
        // System.out.println(dup);
    }
}
