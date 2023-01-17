public class findLastIndex {
    static void lastIndes(int arr[],int idx){
        if(idx==arr.length){
            System.out.println("The last index of the array is: "+idx);
            return;
        }
        lastIndes(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 8,4, 6, 7, 8 };
        lastIndes(arr, 0);
    }
}
