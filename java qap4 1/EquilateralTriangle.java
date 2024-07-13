// EquilateralTriangle.java
public class EquilateralTriangle extends Shape {
    private double side;

    public EquilateralTriangle(double side) {
        super("Equilateral Triangle");
        this.side = side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }
}
