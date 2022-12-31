import java.util.Scanner;

class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.imag * b.imag)), ((a.real * b.imag) + (a.imag * b.real)));
    }

    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }
}

class problem_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter real part of complex number 1: ");
        int real1 = scn.nextInt();
        System.out.println("Enter complex part of complex number 1 without iota sign: ");
        int comp1 = scn.nextInt();
        System.out.println("Enter real part of complex number 2: ");
        int real2 = scn.nextInt();
        System.out.println("Enter complex part of complex number 2 without iota sign: ");
        int comp2 = scn.nextInt();
        Complex c = new Complex(real1, comp1);
        Complex d = new Complex(real2, comp2);
        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
