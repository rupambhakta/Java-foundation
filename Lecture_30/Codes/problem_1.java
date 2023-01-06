// Q1 - Given a number n, print the following pattern without using any loop.
//  n, n-5, n-10, …, 0, 5, 10, …, n-5, n

import java.util.Scanner;

public class problem_1 {
    static void pattern(int n, int m, boolean flag) {
        System.out.println(m + " ");
        if (flag == false && n == m) {
            return;
        }
        if(flag){
            if(m-5>0){
                pattern(n, m-5, true);
            }
            else{
                pattern(n, m-5, false);
            }
        }
        else{
            pattern(n, m+5, false);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        pattern(n, n, true);
    }
}
