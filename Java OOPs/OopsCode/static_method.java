class demo {
    int id;
    int prise;
    static String brand; // Static variable

    // Static block
    static {
        brand = "Sansung";
    }
    //Static method
    public static void show2(demo obj){
        System.out.println(obj.id + " : " + obj.prise + " : " + brand);
    }

    public void show() {
        System.out.println(id + " : " + prise + " : " + brand);
    }
}

public class static_method {
    public static void main(String[] args) {
        demo obj = new demo();
        demo obj2 = new demo();
        obj.id = 1;
        obj.prise = 1200;
        demo.brand = "Nokia";
        obj2.brand = "Apple";

        obj.show();
        obj.show2(obj2);
    }
}
