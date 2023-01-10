import java.util.Scanner;
//Q3 - Given a number n, check whether it's a prime number or not using recursion

// Input1 : n = 11
// Output1 : Yes

// Input2 : n = 15
// Output2 : No

public class problem_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = scn.nextInt();
        if (isPrime(n, 2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    // Creating a function for finding prime.
    public static boolean isPrime(int n, int i) {
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        // Check for next divisor
        return isPrime(n, i + 1);
    }
}
