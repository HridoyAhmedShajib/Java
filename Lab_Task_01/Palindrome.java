import java.util.Scanner;

public class Palindrome {
    int number;

    public Palindrome() {
        number = 0;
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = scanner.nextInt();
    }

    public boolean isPalindrome() {
        int originalNumber = number;
        int reversedNumber = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }

        return number == reversedNumber;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.getInput();

        if (palindrome.isPalindrome()) {
            System.out.println(palindrome.number + " is a palindrome.");
        } else {
            System.out.println(palindrome.number + " is not a palindrome.");
        }
    }
}
