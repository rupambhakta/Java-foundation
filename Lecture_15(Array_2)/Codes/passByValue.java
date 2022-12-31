public class passByValue {
    static void printArray(int arr[]){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    static void changeArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
        System.out.println("Afer changing: ");
        printArray(arr);
    }
    public static void main(String[] args) {
        int arr[]=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        printArray(arr);
        changeArray(arr);
        System.out.println("Original array is: ");
        printArray(arr);

    }
}
