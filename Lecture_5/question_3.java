import java.util.Scanner;
public class question_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        System.out.println(sum);
    }
}
