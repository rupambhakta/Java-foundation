import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        /*
            Integer i=Integer.valueOf(4);
            System.out.println(i);
            Float j=Float.valueOf(5.45f);
            System.out.println(j);
        */
        ArrayList<Integer> l1=new ArrayList<>();
        // Add new element
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);

        //get an element at index i
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));

        //Print with for loop
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();

        //Print the array list directly
        System.out.println(l1);

        // Adding element at some index i
        l1.add(1,100);
        System.out.println(l1);

        // Modify element at index i
        l1.set(1, 10);
        System.out.println(l1);

        //Remove an element at index i
        l1.remove(1);
        System.out.println(l1);

        // Removing an element e
        /*  
            System.out.println(l1.remove(Integer.valueOf(5)));        
        */
         l1.remove(Integer.valueOf(5));
        System.out.println(l1);

        // Check if an element exist or not
        boolean ans=l1.contains(Integer.valueOf(4));
        System.out.println(ans);

        //If to don't sepcify class , you can put anything inside l
        ArrayList l=new ArrayList();
        l.add("pqres");
        l.add(1);
        l.add(true);
        System.out.println(l);
    }
}
