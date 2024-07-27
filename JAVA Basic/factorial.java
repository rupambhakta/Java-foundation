import java.util.Scanner;

class factorial {
    public static int calculateFactorial(int n) {
        if(n==0){
            return 1;
        }
        int factorial = calculateFactorial(n-1);
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int n = sc.nextInt();
        int fact = calculateFactorial(n);
        System.out.println(fact);
    }
}