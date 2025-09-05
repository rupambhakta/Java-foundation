class car {
    int salary;
    String name;

    car(int salary, String name) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " " + salary);
    }
}

public class Constructor {
    public static void main(String[] args) {
        car bmw = new car(123, "Rupam");
        bmw.display();
    }
}
