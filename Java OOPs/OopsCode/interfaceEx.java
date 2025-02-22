interface A {
    void show();
    int age = 20;
    void print();
}
class B implements A{
    public void show(){
        System.out.println("Method in show!");
    }
    public void print(){
        System.out.println("Method of print!!");
    }
}

public class interfaceEx {
    public static void main(String[] args) {
        B obj = new B() ;
        obj.show();
        obj.print();
        System.out.println(B.age);
    }
}
