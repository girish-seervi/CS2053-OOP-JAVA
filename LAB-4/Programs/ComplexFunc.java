package lab04;

class Complex {
    double real, imaginary;

    Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }

    Complex add(double real) {
        return new Complex(this.real + real, this.imaginary);
    }

    void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

class SubtractComplex extends Complex {
    SubtractComplex(double real, double imaginary) {
        super(real, imaginary);
    }

    SubtractComplex subtract(SubtractComplex c) {
        return new SubtractComplex(this.real - c.real, this.imaginary - c.imaginary);
    }

    SubtractComplex subtract(double real) {
        return new SubtractComplex(this.real - real, this.imaginary);
    }
}

public class ComplexFunc {
    public static void main(String[] args) {
        Complex c1 = new Complex(5.0, 4.0);
        Complex c2 = new Complex(2.0, 3.0);

        Complex sum1 = c1.add(c2); // complex + complex
        Complex sum2 = c1.add(2.5); // complex + real

        sum1.display();
        sum2.display();

        SubtractComplex sc1 = new SubtractComplex(7.0, 5.0);
        SubtractComplex sc2 = new SubtractComplex(4.0, 2.0);

        SubtractComplex diff1 = sc1.subtract(sc2); // complex - complex
        SubtractComplex diff2 = sc1.subtract(1.5); // complex - real

        diff1.display();
        diff2.display();
    }
}
