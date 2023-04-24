//Q3. Create an object of the student class created above and print its attribute values as 
// assigned by you. 

public class assignmentQuestion_3{
    public static class student {
        String name;
        String rollNumber;
        String mobileNumber;
        public student(){

        }

        public student(String name, String rollNumber, String mobileNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.mobileNumber = mobileNumber;
        }
    }

    public static void main(String[] args) {
        student x= new student("Rupam","8","9091909146");
        System.out.println(x.name);
        System.out.println(x.rollNumber);
        System.out.println(x.mobileNumber);
    }
}