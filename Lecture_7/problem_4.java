import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = 1; // variable that will check for each number starting from 1 till n
        while (num <= n) {
            int count = 0;
            int i = num;
            while (i > 0) {
                count++;
                i /= 10;
            }
            int val = num; // store value of current num in a temporary variable to calculate sum of its
                           // digits

            int sum = 0;
            while (val > 0) { // break the number digit by digit until it reaches 0
                int digit = val % 10;
                sum += Math.pow(digit, count);// add cube of digit to sum
                val /= 10;
                if (sum > val) { // if sum has exceeded our current number, there is no way for it to be an
                                 // Armstrong number

                    continue;
                }
            }
            if (sum == num) { // this is an armstrong number
                System.out.println(num);
            }
            num++;
        }
    }
}
