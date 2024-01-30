class Box {
    double length;
    double width;
    double height;

    // Constructor to initialize Box dimensions
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to check and adjust dimensions
    public void checkAndAdjustDimensions() {
        // Check and adjust length
        if (length != 10) {
            length = Math.max(10, length + 1); // Increment if less than 10
        }

        // Check and adjust width
        if (width != 12) {
            width = Math.max(12, width + 1); // Increment if less than 12
        }

        // Check and adjust height
        if (height != 8) {
            height = Math.max(8, height - 2); // Decrement if greater than 8
        }
    }

    // Method to display Box dimensions
    public void displayDimensions() {
        System.out.println("Length: " + length + " meters");
        System.out.println("Width: " + width + " meters");
        System.out.println("Height: " + height + " meters");
    }
}

class BoxTest {
    public static void main(String[] args) {
        // Creating a Box object with initial dimensions
        Box box = new Box(9, 12, 10);

        // Displaying initial dimensions
        System.out.println("Initial Box Dimensions:");
        box.displayDimensions();

        // Checking and adjusting dimensions
        box.checkAndAdjustDimensions();

        // Displaying adjusted dimensions
        System.out.println("\nAdjusted Box Dimensions:");
        box.displayDimensions();
    }
}
