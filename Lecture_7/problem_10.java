import java.util.Scanner;

public class problem_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i * i <= n; i++) {
            System.out.print(i * i + " "); // only those bulbs will remain on which are perfect
            // squares as perfect squares have odd number of divisors due to their square
            // root being
            // the extra one, whereas rest have even number of divisors
        }
    }
}
