import java.util.*;

public class setInterfaceExamples {
    public static void main(String[] args) {
        // HashSet<Integer> st = new HashSet<>(); //// O(1)
        // LinkedHashSet<Integer> st = new LinkedHashSet<>(); //// Ordered of insertion
        TreeSet<Integer> st = new TreeSet<>(); //Sorted order O(log n)
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st);
        st.remove(2);
        st.remove(3);
        System.out.println(st.contains(2));
        System.out.println(st.size());
    }
}
