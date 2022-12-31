package Lecture_10.Codes;

import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int n = scn.nextInt();
        int decimalnum = 0;
        int power = 1;
        while (n != 0) {
            int rem = n % 2;
            decimalnum += rem * power;
            power *= 2;
            n /= 10;
        }
        System.out.print(decimalnum);
    }
}
