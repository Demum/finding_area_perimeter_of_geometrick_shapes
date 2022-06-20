package AreaPerimeterOfGeometricShapes;

public class Triangle extends Shape implements Area ,Perimeter {
 static double a,b,c;

    @Override
    public String getModel() {
        return "Triangle";

    }
    public Triangle() {}
    public Triangle(double a, double b, double c) {

        if (a <= 0 | b <= 0 | c<= 0) {
            throw new IllegalArgumentException("Rectangle side must be more 0");
        } else {
           this.a=a;
           this.b=b;
           this.c=c;
        }
    }

    @Override
    public double area() {
        double p =(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }


}
