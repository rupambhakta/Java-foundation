import java.util.Collections;

public class sortPosNeg {
    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void partition(int num[]) {
        int l = 0, r = num.length - 1;
        while (l < r) {
            while (num[l] < 0) {
                l++;
            }
            while (num[r] >= 0) {
                r--;
            }
            if (l < r) {
                int temp = num[l];
                num[l] = num[r];
                num[r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int num[] = { -13, 20, 7, 0, -4, -13, 11, -5, -13 };
        partition(num);
        display(num);
    }
}
