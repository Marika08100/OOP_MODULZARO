package shape;

public class Main {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(4.56);
            System.out.println("The perimeter of the circle: " + circle.calculatePerimeter());
            System.out.println("The area of the circle: " + circle.calculateArea());

            Square square = new Square(-3);
            System.out.println("The perimeter of the square: " + square.calculatePerimeter());
            System.out.println("The area of the square: " + square.calculateArea());

            Rectangle rectangle = new Rectangle(2.5, 3);
            System.out.println("The perimeter of the rectangle: " + rectangle.calculatePerimeter());
            System.out.println("The area of the rectangle: " + rectangle.calculateArea());

        } catch (NegativOrZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

