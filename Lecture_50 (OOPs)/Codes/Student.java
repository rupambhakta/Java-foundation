public class Student {
        String name;
        int roll;
        double persent;
        final String schoolName = "SHC";
        static int numOfStudent;
        public Student() {

        }

        // public Student(String naam,int rno,double per){ // Constrouctor
        // name=naam;
        // roll=rno;
        // persent=per;
        // }
        public Student(String name, int roll, double persent) { // Constrouctor , 'this' operator
                this.name = name;
                this.roll = roll;
                this.persent = persent;
                numOfStudent++;
        }

        public int getRoll() { // Getter
                return roll;
        }

        public void setRoll(int rollNo) { // Setter
                roll = rollNo;
        }
}
