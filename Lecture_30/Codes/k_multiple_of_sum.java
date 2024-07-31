import java.util.Scanner;

public class k_multiple_of_sum {
    /*
     * constants: k>0
     * Input: num = 12, k = 5
     * Output: 12,24,36,48,60
     */

    public static void findKMultiple(int num, int k) {
        if(k==0){
            return;
        }
        findKMultiple(num, k-1);
        System.out.print(num*k +" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        System.out.print("Enter K: ");
        int k = sc.nextInt();

        findKMultiple(num, k);

    }
}
