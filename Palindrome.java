import java.util.Scanner;

class Palindrome {
    int number;

    // Default constructor
    public Palindrome() {
        number = 0;
    }

    // Parameterized constructor
    public Palindrome(int num) {
        number = num;
    }

    // Function to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = scanner.nextInt();
    }

    // Function to check if the number is a palindrome
    public boolean isPalindrome() {
        int originalNumber = number;
        int reversedNumber = 0;

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            originalNumber /= 10;
        }

        return number == reversedNumber;
    }

    public static void main(String[] args) {
        Palindrome palindromeObj = new Palindrome();
        palindromeObj.getInput();

        if (palindromeObj.isPalindrome()) {
            System.out.println(palindromeObj.number + " is a palindrome.");
        } else {
            System.out.println(palindromeObj.number + " is not a palindrome.");
        }
    }
}
