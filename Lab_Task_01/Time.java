class Time {
    int hours;
    int minutes;
    int seconds;

    // Constructor with default values
    Time() {
        this(0, 0, 0);
    }

    // Constructor with specified values
    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to add two Time objects
    Time addTime(Time time1, Time time2) {
        Time result = new Time();

        // Calculate total seconds
        int totalSeconds = (time1.hours + time2.hours) * 3600 + (time1.minutes + time2.minutes) * 60 + (time1.seconds + time2.seconds);

        // Calculate hours, minutes, and seconds from totalSeconds
        result.hours = totalSeconds / 3600;
        result.minutes = (totalSeconds % 3600) / 60;
        result.seconds = totalSeconds % 60;

        return result;
    }

    // Method to display the time
    void display() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}

class Mainn {
    public static void main(String[] args) {
        // Input Time objects
        Time time1 = new Time(2, 55, 40);
        Time time2 = new Time(5, 20, 30);

        // Create a third Time object and add the times
        Time resultTime = new Time().addTime(time1, time2);

        // Display the result
        System.out.print("Input Time 1: ");
        time1.display();

        System.out.print("Input Time 2: ");
        time2.display();

        System.out.print("Output Time: ");
        resultTime.display();
    }
}