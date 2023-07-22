package shape;

public class Main {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(4.56);
            System.out.println("A kor kerulete: " + circle.calculatePerimeter());
            System.out.println("A kor teruelete : " + circle.calculateArea());

            Square square = new Square(6);
            System.out.println("A negyzet kerulete: " + square.calculatePerimeter());
            System.out.println("A negyzet terulete : " + square.calculateArea());

            Rectangle rectangle = new Rectangle(2.5, 3);
            System.out.println("A teglalap kerulete : " + rectangle.calculatePerimeter());
            System.out.println("A teglalap terulete : " + rectangle.calculateArea());

        } catch (SideOutOfBoundsException | RadiusOutOfBoundsException | LengthWidthOutOfBoundsException e) {
            System.out.println("Hiba " + e.getMessage());
        }
    }
}
