
// public class question_5 {
//     public static void main(String[] args) {
//         int arr_1[]={1,2,3,4,5};
//         int arr_2[]={1,2,3,4,5};
//         boolean check=true;
//         for(int i=0;i<arr_1.length;i++){
//             for(int j=0;j<arr_2.length;j++){
//                 if(arr_2[j]!=arr_1[i]){
//                     check=false;
//                     break;
//                 }
//             }
//         }
//         System.out.println(check);
//     }
// }
import java.util.Scanner;
public class question_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Put values in array 1: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }
        boolean ans = true;
        System.out.println("Put values in array 2: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = scn.nextInt();
            if (arr2[i] != arr1[i]) {
                ans = false;
                break;
            }
        }
        System.out.print(ans);
    }
}
