import java.util.Scanner;

public class palindrom {
    static boolean isPalindrom(int x){
        String str=Integer.toString(x);
        int left=0;
        int right=str.length()-1;
        while (left<right) {
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check palindrom or not: ");
        int x=sc.nextInt();
        System.out.println(isPalindrom(x));
    }
}
