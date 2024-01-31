import java.util.Scanner;

class Reverse {
    int value;

    Reverse() {
        value = 123;
    }

    Reverse(int value) {
        this.value = value;
    }

    void getInput() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        value = a;
    }

    void doReverse() {
        int reversed = 0;
        int original = value;

        while (original > 0) {
            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }

        System.out.println("Reverse: " + reversed);
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        Reverse p = new Reverse();

        System.out.println("Default Reverse:");
        r.doReverse();

        System.out.println("Enter a number: ");
        p.getInput();
        p.doReverse();
    }
}
