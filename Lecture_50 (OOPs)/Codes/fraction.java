public class fraction {
    static int gcd(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        int numerator = f1.num * f2.den + f2.num * f1.den;
        int denominator = f1.den * f2.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }
    public static Fraction multiply(Fraction f1, Fraction f2) {
        int numerator = f1.num * f2.num;
        int denominator = f1.den * f2.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }
    public static Fraction substruct(Fraction f1, Fraction f2) {
        int numerator =f1.num * f2.den - f2.num * f1.den;
        int denominator = f1.den * f2.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }
    public static Fraction divition(Fraction f1, Fraction f2) {
        int numerator =f1.num*f2.den;
        int denominator = f1.den * f2.num;
        Fraction f3 = new Fraction(numerator, denominator);
        return f3;
    }

    public static class Fraction {
        int num;
        int den;

        public Fraction(int num, int den) {
            this.num = num;
            this.den = den;
            simplyfly();
        }

        public void simplyfly() {
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 4);
        Fraction f2 = new Fraction(2, 4);
        Fraction f4 = add(f1, f2);
        System.out.println(f4.num + "/" + f4.den);
        Fraction f3 = multiply(f1, f2);
        System.out.println(f3.num + "/" + f3.den);
        Fraction f5= substruct(f1, f2);
        System.out.println(f5.num + "/" + f5.den);
        Fraction f6= divition(f1, f2);
        System.out.println(f6.num + "/" + f6.den);
        
    }
}
