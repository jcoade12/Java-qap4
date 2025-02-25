// Demo.java
public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
            new Circle(5),
            new Ellipse(7, 3),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(6)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
