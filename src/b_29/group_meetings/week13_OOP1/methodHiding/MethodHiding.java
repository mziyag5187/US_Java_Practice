package b_29.group_meetings.week13_OOP1.methodHiding;

// Superclass
class Shape {
    // Static method in the superclass to print general shape information
    public static void printInfo() {
        System.out.println("This is a shape.");
    }
}

// Subclass inheriting from Shape
class Circle extends Shape {
    // Method hiding in the subclass to print circle-specific information
    public static void printInfo() {
        System.out.println("This is a circle.");
    }
}

// Subclass inheriting from Shape
class Rectangle extends Shape {
    // Method hiding in the subclass to print rectangle-specific information
    public static void printInfo() {
        System.out.println("This is a rectangle.");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        // Calling static methods on the superclass and its subclasses

        Shape.printInfo();  // Output: "This is a shape." (static method from Shape class)

        Circle.printInfo();  // Output: "This is a circle." (static method from Circle class - method hiding)

        Rectangle.printInfo();  // Output: "This is a rectangle." (static method from Rectangle class - method hiding)
    }
}
