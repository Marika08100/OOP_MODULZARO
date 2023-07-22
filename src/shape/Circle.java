package shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) throws RadiusOutOfBoundsException {
        if(radius <= 0){
            throw new RadiusOutOfBoundsException(("A sugar nem lehet 0, vagy negativ!"));
        }
        this.radius = radius;
    }


    @Override
    public double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
