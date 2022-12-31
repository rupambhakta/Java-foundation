public class problem_1 {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,3,6};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(i+1);
                }
            }
        }
    }
}
