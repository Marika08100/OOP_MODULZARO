package shape;

public class Square extends Shape{
    private double side;

    public Square(double side) throws NegativeOrZeroException {
        if(side <= 0){
            throw new NegativeOrZeroException("The side cannot be 0 or negative!");
        }
        this.side = side;
    }
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
