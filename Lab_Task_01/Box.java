class Box {
    double length;
    double width;
    double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void checkAndAdjustDimensions() {
        if (length != 10) {
            length = Math.max(10, length + 1);
        }

        // Check and adjust width
        if (width != 12) {
            width = Math.max(12, width + 1);
        }


        if (height != 8) {
            height = Math.max(8, height - 2);
        }
    }

    public void displayDimensions() {
        System.out.println("Length: " + length + " meters");
        System.out.println("Width: " + width + " meters");
        System.out.println("Height: " + height + " meters");
    }
}

class BoxTest {
    public static void main(String[] args) {
        Box box = new Box(9, 12, 10);

        System.out.println("Initial Box Dimensions:");
        box.displayDimensions();

        box.checkAndAdjustDimensions();

        System.out.println("\nAdjusted Box Dimensions:");
        box.displayDimensions();
    }
}
