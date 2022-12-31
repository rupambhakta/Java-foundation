import java.util.Scanner;

// Sum of 1-2+3-4____n
public class sum_of_followinf_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        int ans=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                ans-=i;
            }
            else{
                ans+=i;
            }
        }
        System.out.println("The diseted sum is "+ans);
    }
}
