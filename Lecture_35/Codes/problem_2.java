import java.util.Scanner;

public class problem_2 {
    public static void printBinaryNumber(int remainingChars, String ans, int numberOfOnes, int numberOfZeroes) {
        if (remainingChars == 0) {
            System.out.println(ans);
            return;
        }
        printBinaryNumber(remainingChars - 1, ans + "1", numberOfOnes + 1, numberOfZeroes);
        if (numberOfZeroes + 1 <= numberOfOnes)
            printBinaryNumber(remainingChars - 1, ans + "0", numberOfOnes, numberOfZeroes + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printBinaryNumber(n, "", 0, 0);
    }
}