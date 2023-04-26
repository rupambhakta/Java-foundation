public class assignmentQuestion_7 {
    // Q7. Make a Non-argument constructor of the class named Book which has
    // attributes of string name and
    // integer id and check output by printing the attribute values of the object
    // after initializing it.
    public static class Book {
        private String name;
        private int id;

        public Book() {
            name = "Unknown";
            id = 0;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Book myBook = new Book();
        System.out.println("Name: " + myBook.getName());
        System.out.println("ID: " + myBook.getId());
        
        Book myBook2 = new Book();
        myBook2.setName("The Catcher in the Rye");
        myBook2.setId(12345);
        System.out.println("Name: " + myBook2.getName());
        System.out.println("ID: " + myBook2.getId());

    }
}