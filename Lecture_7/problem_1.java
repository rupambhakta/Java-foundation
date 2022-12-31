import java.util.Scanner;

//Count how many elements are in a given number
public class problem_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        int count=0;
        while(n>0){
            n /=10;
            count++;
        }
        System.out.println("The recuard count is  "+count);
    }
}
