
class Test{
    int i=100;
    class Test2{
        void display(){
            System.out.println(i);
        }
    }
    Test2 obj = new Test2();
    
}
public class inner_class {
    public static void main(String[] args) {
        Test T = new Test();
        T.obj.display();
        Test.Test2 t2 = T.new Test2();
        t2.display();
    }
}
