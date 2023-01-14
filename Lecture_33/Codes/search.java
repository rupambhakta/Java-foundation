public class search {
    static void findAllIndexes(int arr[],int n,int terget,int idx){
        if(idx>=n){
            return;
        }
        if(arr[idx]==terget){
            System.out.print(idx+" ");
        }
        findAllIndexes(arr, n, terget, idx+1);
    }

    static int findIndex(int arr[], int n, int terget, int idx) {
        if (idx >= n) {
            return -1;
        }
        if (arr[idx] == terget) {
            return idx;
        }
        return findIndex(arr, n, terget, idx + 1);
    }

    static boolean Search(int arr[], int n, int terget, int idx) {
        if (idx >= n) {
            return false;
        }
        if (arr[idx] == terget) {
            return true;
        }
        return Search(arr, n, terget, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 8,4, 6, 7, 8 };
        int terget = 8;
        if (Search(arr, arr.length, terget, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(findIndex(arr, arr.length, terget, 0));
        findAllIndexes(arr, arr.length, terget, 0);
    }
}
