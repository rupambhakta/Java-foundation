import java.util.*;
public class numberOfOccarenceOfAPartivularElement{
    public static void main(String args[]){
        int arr[]={1,2,3,2,4,5,6,3,7,9,8,0,8,5,6,4,4,7,8,4,3,5,7,8,9,0,1,2,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                count++;
            }
        }
        System.out.println(count);
    }
}
