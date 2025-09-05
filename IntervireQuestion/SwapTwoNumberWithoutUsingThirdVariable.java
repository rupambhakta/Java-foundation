public class SwapTwoNumberWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        System.out.println("Before swaping a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swaping a = " + a + " b = " + b);
    }
}
