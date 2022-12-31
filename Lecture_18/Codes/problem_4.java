import java.util.Scanner;

public class problem_4 {

    static void swapInarray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void reverse(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swapInarray(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Put value on array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a terget sum : ");
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==m){
                    System.out.println(" The indexes are: "+i+" and "+j);
                    break;
                }
            }
        }

        // printArray(arr);
    }
}
