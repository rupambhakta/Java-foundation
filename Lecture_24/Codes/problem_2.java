import java.util.ArrayList;

public class problem_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(10);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
