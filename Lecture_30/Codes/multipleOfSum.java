import java.util.Scanner;

public class multipleOfSum {
    static void mulSum(int num, int k) {
        if (k == 1) {
            System.out.print(num+" ");
            return;
        }
        mulSum(num, k-1);
        System.out.print(num*k+ " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        mulSum(num, k);
    }
}
