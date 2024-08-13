import java.util.*;

public class Isomorphic {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<>();
        HashSet<Character> st = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character sch = s.charAt(i);
            Character tch = s.charAt(i);
            if (mp.containsKey(sch)) {
                if (mp.get(sch) != tch)
                    return false;
            } else if (st.add(tch)) {
                return false;
            } else {
                mp.put(sch, tch);
                st.add(tch);
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
