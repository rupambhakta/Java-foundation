import java.util.*;
public class stringBuildler {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append("World");
        // System.out.println(str);
        // str.setCharAt(0, 'm');
        str.insert(2, 'y');
        System.out.println(str);
        str.delete(2,3);
        System.out.println(str);
    }
}
