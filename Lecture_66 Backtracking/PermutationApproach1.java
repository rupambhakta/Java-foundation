import java.util.*;

public class PermutationApproach1 {
    public static void printp(String str, String t, List<String> l) {
        if (str.equals("")) {
            l.add(t);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String rem = left + right;
            printp(rem, t + ch,l);
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        List<String> l = new ArrayList<>();
        printp(str, "", l);
        System.out.println(l);
    }
}
