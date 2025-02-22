public class A1 {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }finally{
            System.out.println("Print statement in finally block!");
        }
    }
}
