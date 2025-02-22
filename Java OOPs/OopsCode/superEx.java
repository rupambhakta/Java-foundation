class A{
    public A(){
        System.out.println("Conatroctor of A.");
    }
    public A(int n){
        System.out.println(n);
    }
}
class B extends A {
    public B(){
        
        System.out.println("Constructor in B class!");
    }
}

public class superEx {
    public static void main(String[] args) {
        B obj = new B();
        
    }
}
