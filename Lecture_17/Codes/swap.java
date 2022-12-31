public class swap {
    public static void main(String[] args) {
        int a=5;
        int b=3;
        System.out.println("Before swaping the value of a and b is : "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping the value of a and b is : "+a+" "+b);
    }
}
