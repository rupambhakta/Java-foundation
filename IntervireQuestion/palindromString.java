public class palindromString {
    public static void main(String args[]) {
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
        
        if (str.equals(rev)) {
            System.out.println(str + " is a palindrom string");
        } else {
            System.out.println("Not a palindrom");
        }
    }
}
