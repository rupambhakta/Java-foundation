class main{
    String name;
    int yearOfJoining;
    int salary;
    String address;

}

public class problem_5 {
    // String name="Rupam";
    // int yearOfJoining=2022;
    // int salary=5000;
    // String address="Shrikole";
    public static void main(String[] args) {
        main emp1=new main();
        emp1.name="Rupam";
        emp1.yearOfJoining=2022;
        emp1.salary=50000;
        emp1.address="shrikole";
        System.out.println("The name of the employee is: "+emp1.name);
        System.out.println("The  year of joining is: "+emp1.yearOfJoining);
        System.out.println("The  salary is: "+emp1.salary);
        System.out.println("The  address is: "+emp1.address);
        System.out.println();
        main emp2=new main();
        emp2.name="Bhakta";
        emp2.yearOfJoining=2023;
        emp2.salary=30000;
        emp2.address="Shyampur";
        System.out.println("The name of the employee is: "+emp2.name);
        System.out.println("The  year of joining is: "+emp2.yearOfJoining);
        System.out.println("The  salary is: "+emp2.salary);
        System.out.println("The  address is: "+emp2.address);
    }
}
