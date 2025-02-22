abstract class AIC{
    abstract void m();
}
public class annonymous_inner_class {
    public static void main(String[] args) {
        AIC obj = new AIC() {
            void m() {
                System.out.println("Hello");
            }
        };
        obj.m();
    }
}
