public class Local_Inner_Class {
    private int i = 100;
    void display(){
        class LIC{
            void display(){
                System.out.println(i);
            }
        }
        LIC l1 = new LIC();
        l1.display();
    }    
    public static void main(String[] args) {
        Local_Inner_Class l1 = new Local_Inner_Class();
        l1.display();
    }
}
