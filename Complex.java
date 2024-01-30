import java.util.Scanner;

public class Complex {
    int real;
    int imag;

    public Complex() {
        real = 0;
        imag = 0;
    }
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real and imaginary numbers respectively: ");
        real = scanner.nextInt();
        imag = scanner.nextInt();
    }
    public Complex add(Complex other) {
        int sumReal = this.real + other.real;
        int sumImag = this.imag + other.imag;
        return new Complex(sumReal, sumImag);
    }
    public void display() {
        System.out.println("Sum = " + real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        Complex complex1 = new Complex();
        Complex complex2 = new Complex();
        complex1.read();
        complex2.read();
        Complex sum = complex1.add(complex2);
        sum.display();
    }
}
