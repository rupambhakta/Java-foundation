import java.util.ArrayList;
import java.util.Collections;
public class problem {
    static void reverseList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;

        while (i < j) {
            /*
             *   int temp=a;
             *   a=b;
             *   b=temp
             */
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(22);
        list.add(10);
        System.out.println("original List: " + list);
        // reverseList(list);
        Collections.reverse(list);
        System.out.println("reversed List: " + list);
        Collections.sort(list);
        System.out.println("Ascending order: "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Dissending order: "+list);


        ArrayList<String> l1=new ArrayList<>();
        l1.add("Welcome");
        l1.add("Hellow");
        l1.add("two");
        l1.add("physics");
        System.out.println("Original list: "+l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Sorted list: "+l1);
    }
}
