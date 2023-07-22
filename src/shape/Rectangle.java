package shape;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) throws NegativeOrZeroException {
        if(length <= 0 || width <= 0){
            throw new NegativeOrZeroException("Sides cannot be 0 or negative!");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
