public class Armstrong {
    public static void main(String[] args) {
        int num = 153, temp = num, sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.println(num + " is a Armstrong number");
        } else {
            System.out.println(num + " is not a Armstrong number");
        }
    }
}
