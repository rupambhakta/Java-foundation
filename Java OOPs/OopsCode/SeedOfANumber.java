import java.util.Scanner;

public class SeedOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number, second number must be grater than the first one : ");
        int x= sc.nextInt();
        int y=sc.nextInt();
        int res=x;
        while(x!=0){
            res = res*(x%10);
            x=x/10;
        }
        if(res==y){
            System.out.println(res+" is a seed of "+y);
        }else{
            System.out.println(res+" is not a seed of "+y);
        }
    }
}
