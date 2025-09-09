package cie01;

public class ComplexNumber {
    double real;
    double imaginary;

    // Constructor to initialize real and imaginary parts
    public ComplexNumber(double c, double m) {
        this.real = c;
        this.imaginary = m;
    }

    // Method to add another ComplexNumber to this one and return the result
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Method to print complex number in readable format
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(4, 5);

        ComplexNumber sum = c1.add(c2);

        System.out.print("Sum of complex numbers: " );
        sum.display();
        
    }
}
