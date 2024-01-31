import java.util.Scanner;

class Drive49 {
    private double totalCapacity;
    private double used;
    private double free;

    public Drive49(double totalCapacity) {
        this.totalCapacity = totalCapacity;
        this.used = 0;
        this.free = totalCapacity;
    }

    public void uploadFile(double fileSize) {
        if (fileSize <= free) {
            used += fileSize;
            free -= fileSize;
            System.out.println("File uploaded successfully. Used: " + used + "GB, Free: " + free + "GB");
        } else {
            System.out.println("Not enough free space to upload the file.");
        }
    }

    public void upgradePlan(double additionalCapacity) {
        totalCapacity += additionalCapacity;
        free += additionalCapacity;
        System.out.println("Plan upgraded successfully. Total Capacity: " + totalCapacity + "GB");
    }

    public void viewStatus() {
        System.out.println("Total Capacity: " + totalCapacity + "GB, Used: " + used + "GB, Free: " + free + "GB");
    }
}

class Drive49User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Drive49 service with an initial capacity of 10GB
        Drive49 drive49 = new Drive49(10);

        // Create a user
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Welcome, " + username + "!");

        // Upload a file
        System.out.println("Enter the size of the file to upload (in GB):");
        double fileSize = scanner.nextDouble();
        drive49.uploadFile(fileSize);

        // Upgrade user plan
        System.out.println("Do you want to upgrade your plan? (y/n)");
        char upgradeChoice = scanner.next().charAt(0);
        if (upgradeChoice == 'y') {
            System.out.println("Enter the additional capacity you want to add (in GB):");
            double additionalCapacity = scanner.nextDouble();
            drive49.upgradePlan(additionalCapacity);
        }

        // View user status
        drive49.viewStatus();

        scanner.close();
    }
}
