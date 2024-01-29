import java.util.Scanner;

public class Reverse {
    int number;

    public Reverse() {
        this.number = 0;
    }

    public Reverse(int number) {
        this.number = number;
    }


    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        this.number = scanner.nextInt();
    }

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
        Reverse reverseObj = new Reverse();
        reverseObj.getInput();
        reverseObj.doReverse();
    }
}
