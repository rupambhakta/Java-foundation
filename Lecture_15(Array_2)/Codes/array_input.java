import java.util.Arrays;
import java.util.Scanner;

public class array_input {
    static void printArray(int arr[]){
        System.out.println("The array is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
    static int lastOccurence(int arr[],int x){
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }
    static boolean inSort(int arr[]){
        boolean check=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
    }
    static int[] arraySmallestAndBigest(int arr[]){
        Arrays.sort(arr);
        printArray(arr);
        int[] ans={arr[0],arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        // System.out.println("The array is: ");
        // for (int j = 0; j < n; j++) {
        //     System.out.print(arr[j] + " ");
        // }

        // Tring to copy arr in arr_2
        // int arr_2[]=arr.clone();
        // int arr_2[]=Arrays.copyOf(arr,arr.length);
        // int arr_2[]=Arrays.copyOf(arr,2);
        // int arr_2[]=Arrays.copyOfRange(arr,0,arr.length);
        // System.out.println("Coppid array is : ");
        // printArray(arr_2);

        // arr_2[0]=0;
        // arr_2[1]=0;
        // printArray(arr_2);
        // System.out.println("Original array: ");
        // printArray(arr);

        // System.out.print("Enter x: ");
        // int x =sc.nextInt();
        // System.out.println("The last occurence of x in "+lastOccurence(arr, x)+" index");

        // System.out.println("is sorted : "+inSort(arr));
        
        int ans[]=arraySmallestAndBigest(arr);
        System.out.println("Smallest : "+ans[0]);
        System.out.println("Largest : "+ans[1]);


    }
}
