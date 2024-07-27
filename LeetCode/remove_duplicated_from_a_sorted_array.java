public class remove_duplicated_from_a_sorted_array {
    public static int[] removeDuplicate(int arr[]){
        int k=0;
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            for (int l = i+1; l < arr.length; l++) {
                if(arr[i]==arr[l]){
                    j++;
                }else{
                    arr[]
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[]  arr = {1,1,2,2,2,3,3};


    }
}
