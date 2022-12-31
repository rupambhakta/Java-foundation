import java.util.Scanner;

public class frequencyArray {
    static int[] makeFriquencyArray(int arr[]) {
        int freq[] = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " no element: ");
            arr[i] = sc.nextInt();
        }

        int freq[] = makeFriquencyArray(arr);

        System.out.println("Enter number of queary: ");
        int q = sc.nextInt();

        while(q>0){
            System.out.print("Enter number to be search: ");
            int x=sc.nextInt();
            if (freq[x]>0) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            q--;
        }
    }
}
