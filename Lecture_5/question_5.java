import java.util.Scanner;
public class question_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int n = x ^ y;
        int count = 0;
        while (n != 0){
        n = n & (n - 1);
        count++;
        }
        System.out.print(count);
         }
}
