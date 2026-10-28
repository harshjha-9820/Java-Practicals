

class Shape {

    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void area(double radius) {
        System.out.println("Area of Circle: " +
                (3.14 * radius * radius));
    }

    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {

    @Override
    void display() {
        System.out.println("This is a Circle");
    }
}

class Rectangle extends Shape {

    @Override
    void display() {
        System.out.println("This is a Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {

        Shape s = new Shape();

        // Method Overloading
        s.area(5);
        s.area(4, 6);
        s.area(3.0);

        System.out.println();

        // Parent-class references
        Shape sh;

        sh = new Circle();
        sh.display();

        sh = new Rectangle();
        sh.display();
    }
}
