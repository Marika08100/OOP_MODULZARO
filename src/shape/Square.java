package shape;

public class Square extends Shape{
    private double side;

    public Square(double side) throws SideOutOfBoundsException {
        if(side <= 0){
            throw new SideOutOfBoundsException("Az oldal hossza nem lehet 0,vagy negativ!");
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
