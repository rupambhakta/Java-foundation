interface I1 {
    void m();

    default void n() {
        System.out.println("Default method of I1");
    }
}

class default_method_interface implements I1 {
    public void m() {
        System.out.println("M method of I1 interface!");
    }

    public void show() {
        System.out.println("Show method of C class!");
    }

    public static void main(String[] args) {
        default_method_interface obj = new default_method_interface();
        obj.m();
        obj.n();
        obj.show();
    }
}
