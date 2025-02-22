public class callByValue {
    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        callByValue obj = new callByValue();
        System.out.println("Before calling the method a is "+ a+" b is "+b);
        obj.sum(a, b);
        System.out.println("After calling the method a is "+ a+" b is "+b);
    }
}
