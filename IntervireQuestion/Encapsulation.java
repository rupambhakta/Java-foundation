class Student {
    private String name;

    public String getName() {
        return name;  // only return
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student a = new Student();
        a.setName("Rupam");
        System.out.println(a.getName()); // print outside getter
    }
}
