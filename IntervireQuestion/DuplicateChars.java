import java.util.HashMap;

public class DuplicateChars {
    public static void main(String args[]) {
        String str = "Programming";
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char c : str.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for (char c : mp.keySet()) {
            if (mp.get(c) > 1) {
                System.out.println(c + " : " + mp.get(c));
            }
        }

    }
}
