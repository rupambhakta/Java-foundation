import java.util.Scanner;

public class target_sum {

    static int targer_sum(int arr[], int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    static int unic_number(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] > 0) {
                ans = arr[k];
            }
        }
        return ans;
    }

static int max_value(int arr[]){
    int mx=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>mx){
            mx=arr[i];
        }
    }
    return mx;
}
static int find_secondMax(int arr[]){
    int mx=max_value(arr);
    for(int i=0;i<arr.length;i++){
        if(arr[i]==mx){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    int secondMax=max_value(arr);
    return secondMax;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Put values in array:-");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " no element: ");
            arr[i] = sc.nextInt();
        }
        // System.out.print("Enter the terger sum:");
        // int target = sc.nextInt();
        // System.out.println(targer_sum(arr, target));

        // System.out.println("The unick element is: " + unic_number(arr));

        System.out.println("The mx is "+max_value(arr));
        System.out.println("The second mx is "+find_secondMax(arr));
    }
}
/* Hii i am Rupam Bhakta */