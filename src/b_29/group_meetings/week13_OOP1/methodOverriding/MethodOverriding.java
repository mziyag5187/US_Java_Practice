package b_29.group_meetings.week13_OOP1.methodOverriding;

// Superclass
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclass inheriting from Shape
class Circle extends Shape {
    // Overrides the draw() method in the superclass
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Subclass inheriting from Shape
class Rectangle extends Shape {
    // Overrides the draw() method in the superclass
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Shape shape = new Shape();  // Creates an instance of Shape
        Circle circle = new Circle();  // Creates an instance of Circle
        Rectangle rectangle = new Rectangle();  // Creates an instance of Rectangle

        shape.draw();  // Output: "Drawing a shape"
        circle.draw();  // Output: "Drawing a circle"
        rectangle.draw();  // Output: "Drawing a rectangle"

        // Polymorphism example: Superclass reference pointing to a subclass object
        Shape shape1 = new Circle();  // Superclass reference to a Circle object
        Shape shape2 = new Rectangle();  // Superclass reference to a Rectangle object

        shape1.draw();  // Output: "Drawing a circle" (dynamic binding at runtime)
        shape2.draw();  // Output: "Drawing a rectangle" (dynamic binding at runtime)
    }
}