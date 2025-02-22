interface I{
    void m();
}
public class annonymousInnerClassThroughInterface {
    public static void main(String[] args) {
        I obj = new I() {
            public void m(){
                System.out.println("Hello");
            }
        };
        obj.m();
    }
}
