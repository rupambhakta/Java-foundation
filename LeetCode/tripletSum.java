public class tripletSum{
    public static void main(String args[]){
        int arr[] = {1,4,5,6,3};
        System.out.print(triplet(arr,12));
    }
    public static int triplet(int arr[], int targer){
        int n = arr.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k] == targer){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}