public class callByReference {
    int a = 10;
    int b = 20;
    public void shaw(int a,int b){
        a+=1;
        b+=1;
        System.out.println("Calling method show!");
    }
    public static void main(String[] args) {
        callByReference obj = new callByReference();
        System.out.println("Before calling the method a is "+ a+" b is "+b);
        obj.shaw(a, b);
        System.out.println("After calling the method a is "+ a+" b is "+b);
    }
}
