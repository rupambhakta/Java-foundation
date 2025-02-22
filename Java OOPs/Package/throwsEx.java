
public class throwsEx {
    public int devide(int a,int b)throws ArithmeticException{
        int div = a/b;
        return div;
    }
    public static void main(String[] args) {
        throwsEx obj = new throwsEx();
        try{

            System.out.println(obj.devide(45, 0));
        }catch(ArithmeticException e){
            System.out.println("Exception happen here.");
        }

        System.out.println("Rest of the code");
    }
}
