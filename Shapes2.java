class Shape {
    public double computeArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double computeArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return 0.5 * base * height;
    }
}

public class Shapes2 {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        Shape rectangle = new Rectangle(5, 8);
        Shape triangle = new Triangle(6, 9);

        System.out.println("Area of Circle: " + circle.computeArea());
        System.out.println("Area of Rectangle: " + rectangle.computeArea());
        System.out.println("Area of Triangle: " + triangle.computeArea());
    }
}
