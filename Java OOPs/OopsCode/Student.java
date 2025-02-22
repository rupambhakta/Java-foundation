public class Student {
    int roll;
    String name;
    
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Rupam");
        Student s2 = new Student(2 , "Bhakta");
        System.out.println(s1.roll+" "+s1.name);
        System.out.println(s2.roll+" "+s2.name);
    }

    
}
