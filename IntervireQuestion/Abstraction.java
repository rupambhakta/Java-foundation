
abstract class Animal {
    void sleep() {
        System.out.println("Go to Sleep");
    }

    abstract void run();

}

class Human extends Animal {
    void run() {
        System.out.println("Run fast");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Animal a = new Human();
        a.sleep();
        a.run();
    }
}