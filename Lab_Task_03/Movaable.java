/* Write an interface called Movaable, which contains 4 abstract methods moveUp(),
moveDown(), moveLeft() and moveRight(). This interface must be overridden by two classes
named MovaablePoint and MovaableCircle. Create necessary variables in the classes and
implement the methods in java.
 */


interface Movaable {
    abstract void moveUp();
    abstract void moveDown();
    abstract void moveLeft();
    abstract void moveRight();
}

class MovaablePoint implements Movaable{
    int x;
    int y;
    public MovaablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void moveUp() {y++;}
    public void moveDown() {y--;}
    public void moveLeft() {x--;}
    public void moveRight() {x++;}

    public String toString() {
        return "MovablePoint (" + x + ", " + y + ")";
    }

}


class MovaableCircle implements Movaable{
    MovaablePoint center;
    int radius;

    public MovaableCircle(int x, int y, int radius) {
        this.center = new MovaablePoint(x, y);
        this.radius = radius;
    }


    public void moveUp() {center.moveUp();}
    public void moveDown() {center.moveDown();}
    public void moveLeft() {center.moveLeft();}
    public void moveRight() {center.moveRight();}

    public String toString() {
        return "MovableCircle: Center at " + center.toString() + ", Radius: " + radius;
    }

}


class Main_Movaable {
    public static void main(String[] args) {
        MovaablePoint point = new MovaablePoint(1, 1);
        MovaableCircle circle = new MovaableCircle(3, 3, 5);

        System.out.println("Initial Positions:");
        System.out.println(point);
        System.out.println(circle);


        point.moveUp();
        circle.moveLeft();

        System.out.println("\nPositions After Moving:");
        System.out.println(point);
        System.out.println(circle);
    }
}