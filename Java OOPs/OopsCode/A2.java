public class A2 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }finally{
            System.out.println("Statement of finally block!");
        }
    }
}
