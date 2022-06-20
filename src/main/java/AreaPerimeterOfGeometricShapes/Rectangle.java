package AreaPerimeterOfGeometricShapes;

public class Rectangle extends Shape implements Area, Perimeter {
    public static double a, b;
    @Override
    public String getModel() {
        return "Rectangle";

    }
    public Rectangle() {}
    public Rectangle(double a, double b) {

        if (a <= 0 | b <= 0) {
            throw new IllegalArgumentException("Rectangle side must be more 0");
        } else {

            this.a = a;
            this.b = b;
        }
    }

    @Override
    public double perimeter() {

        return 2 * (a + b);
    }

    @Override
    public double area() {
        return a * b;
    }

}

