import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class problem_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" element: ");
            list.add(sc.nextInt());
        }
        System.out.println("Original array is: "+list);
        Collections.sort(list);
        System.out.println("Sorted list is "+list);
    }
}
