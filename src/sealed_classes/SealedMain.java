package sealed_classes;

sealed class Shape permits Circle, Rectangle, Square {
}

final class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}
}

final class Rectangle extends Shape {
	double length, width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		return length * width;
	}
}

final class Square extends Shape {
	double side;

	Square(double side) {
		this.side = side;
	}

	public double area() {
		return side * side;
	}
}

public class SealedMain {
	public static void main(String[] args) {
		Shape shape1 = new Circle(5);
		Shape shape2 = new Rectangle(4, 6);
		Shape shape3 = new Square(4);

		System.out.println("Circle area: " + ((Circle) shape1).area());
		System.out.println("Rectangle area: " + ((Rectangle) shape2).area());
		System.out.println("Square area: " + ((Square) shape3).area());
	}
}
