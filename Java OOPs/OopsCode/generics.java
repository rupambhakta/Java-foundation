public class generics {
    public static void main(String[] args) {
        printer<Integer> prienter = new printer<>(23);
        prienter.print();
        printer<Double> obj = new printer<>(23.00);
        obj.print();
    }
}
class printer <T>{
    T thingToPrint;
    public printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}