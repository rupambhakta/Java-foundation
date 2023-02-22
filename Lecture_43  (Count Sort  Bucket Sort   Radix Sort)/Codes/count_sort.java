public class count_sort {
    static int findMax(int arr[]) {
        // { 1, 4, 5, 2, 2, 5 }
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static void basicCountSort(int arr[]) {
        int mx = findMax(arr);
        int count[] = new int[mx + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void CountSort(int arr[]) {
        int n = arr.length;
        int output[] = new int[n];
        int mx = findMax(arr);
        int count[] = new int[mx + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        // Copy all element of output in array
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 2, 2, 5, 8, 3, 9, 12, 4, 7 };
        // basicCountSort(arr);
        CountSort(arr);
        display(arr);
    }
}
