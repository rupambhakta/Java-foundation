
abstract class car {
    public abstract void drive();

    void playMusic() {
        System.out.println("Playing music...");
    }

}

class WaganeR extends car {
    public void drive() {
        System.out.println("Driving...");
    }

}

public class AbstractEx {
    public static void main(String[] args) {
        car obj = new WaganeR();
        obj.drive();
        obj.playMusic();
    }
}
