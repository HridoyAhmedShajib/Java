import java.util.*;

class Shape {

    double Perimeter;
    double Area;

    // Method getPerimeter()
    double getPerimeter() {
        return Perimeter;
    }

    // Method getArea()
    double getArea() {
        return Area;
    }
}



class Circle extends Shape {
  double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    // Calculate Perimeter
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    // Calculate Area
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}



class Main_Shape {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Area of the circle: " + circle.getArea());

        scanner.close();
    }
}
