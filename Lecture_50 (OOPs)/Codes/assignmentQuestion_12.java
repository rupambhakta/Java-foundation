//Q12. Make a java class named Employee. Give it attributes like name, id and bossName. Make the bossName 
//static.Write a function named print() which will print all three attributes.

public class assignmentQuestion_12 {

    public static class Employee {
        private String name;
        private int id;
        private static String bossName;

        // Non-argument constructor
        public Employee() {
        }

        // Constructor with arguments
        public Employee(String name, int id, String bossName) {
            this.name = name;
            this.id = id;
            this.bossName = bossName;
        }

        // Print method to print all the attributes
        public void print() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Boss name: " + bossName);
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public static String getBossName() {
            return bossName;
        }

        public static void setBossName(String bossName) {
            Employee.bossName = bossName;
        }
    }

    public static void main(String[] args) {
        Employee.setBossName("John");

        Employee emp1 = new Employee("Alice", 1, Employee.getBossName());
        Employee emp2 = new Employee("Bob", 2, Employee.getBossName());

        emp1.print();
        emp2.print();
    }
}
