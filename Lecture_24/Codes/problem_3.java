import java.util.ArrayList;
import java.util.Collections;;
public class problem_3 {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(0);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        Collections.swap(l1, 2, 4);
        System.out.println(l1);
    }
}
