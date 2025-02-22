
public class excepEx {
    public static void show(int n) {
        if (n < 1) {
            throw new ArithmeticException("Number is less than 1");
        } else {
            System.out.println("Number is greater than zero");
        }
    }

    public static void main(String[] args) {
        excepEx obj = new excepEx();
        obj.show(-5);
        System.out.println("Rest of the code");
    }
}