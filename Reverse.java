import java.util.Scanner;

public class Reverse {
    // Member variable
    int number;

    // Default constructor
    public Reverse() {
        // Initialize number to 0 or any default value
        this.number = 0;
    }

    // Parameterized constructor
    public Reverse(int number) {
        this.number = number;
    }

    // Function to get input from the keyboard
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        this.number = scanner.nextInt();
    }

    // Function to reverse the integer
    public void doReverse() {
        int reversedNumber = 0;
        int originalNumber = this.number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }

    public static void main(String[] args) {
        // Create an instance of the Reverse class
        Reverse reverseObj = new Reverse();

        // Get input from the user
        reverseObj.getInput();

        // Reverse the number and print the result
        reverseObj.doReverse();
    }
}
