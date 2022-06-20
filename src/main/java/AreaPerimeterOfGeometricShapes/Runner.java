package AreaPerimeterOfGeometricShapes;
import java.util.Scanner;
public class Runner {
    public static void main (String[]args){
        System.out.println("Enter radius of the Circle");
        Scanner scanner = new Scanner(System.in);

        double radius=scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.printf("Area of the circle = "+ "%.2f \n", circle.area());
        System.out.printf("Perimeter of the circle = "+ "%.2f \n", circle.perimeter());
       System.out.println("\n");

       System.out.println("Enter length sides of the Rectangle a, b");
        double a= scanner.nextDouble();
        double b=scanner.nextDouble();

        Rectangle rectangle = new Rectangle(a,b);
        System.out.printf("Area of the rectangle = "+ "%.2f \n", rectangle.area());
        System.out.printf("Perimeter of the rectangle = "+ "%.2f \n", rectangle.perimeter());
        System.out.println(("\n"));

        System.out.println("Enter length sides of the Triangle a, b, c");
        a= scanner.nextDouble();
        b=scanner.nextDouble();
        double c= scanner.nextDouble();
        Triangle triangle = new Triangle(a,b,c);
        System.out.printf("Area of the Triangle = "+ "%.2f \n", triangle.area());
        System.out.printf("Perimeter of the Triangle = "+ "%.2f \n", triangle.perimeter());

}
}