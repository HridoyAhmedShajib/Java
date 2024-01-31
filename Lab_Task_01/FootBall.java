import java.util.Scanner;
class Football {
    // Data members
    int radius;
    int weight;

    // Parameterized constructor
    Football(int r, int w) {
        radius = r;
        weight = w;
    }

    // Default constructor
    Football() {
        radius = 1;
        weight = 2;
    }

    // Member function to display values
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Weight: " + weight);
    }
}

class Main_Football {
    public static void main(String[] args) {
        // Creating objects
        Football ob1 = new Football(10, 20);
        Football ob2 = new Football();

        // Displaying values
        System.out.println("Values of ob1:");
        ob1.display();

        System.out.println("\nValues of ob2:");
        ob2.display();
    }
}