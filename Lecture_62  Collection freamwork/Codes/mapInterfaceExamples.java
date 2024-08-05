import java.util.*;

public class mapInterfaceExamples {
    public static void main(String[] args) {
        // Map<Integer,String> mp = new HashMap<>();
        // Map<Integer,String> mp = new LinkedHashMap<>();
        TreeMap<Integer,String> mp = new TreeMap<>();
        mp.put(3, "Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Riya");
        mp.putIfAbsent(4, "Priya");
        //Itrating over in a map
        for(Integer i : mp.keySet()){
            // System.out.println(i);
        }
        for(var i : mp.values()){
            // System.out.println(i);
        }

        // Itreate over key value mapping
        for(var e : mp.entrySet()){
            System.out.println(e);
            // System.out.println(e.getKey());
            // System.out.println(e.getValue());
        }




        // System.out.println(mp.entrySet());
        // System.out.println(mp.get(2));
        // System.out.println(mp.containsKey(4));
        // System.out.println(mp.containsValue("Riya"));
        // System.out.println(mp.keySet());
        // System.out.println(mp.values());

    }
}
