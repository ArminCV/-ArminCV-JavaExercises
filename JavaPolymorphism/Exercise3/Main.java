package JavaPolymorphism.Exercise3;

public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape();
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(12, 34);
        Triangle triangle = new Triangle(5,9);

        double c_area = circle.calculateArea();
        double r_area = rectangle.calculateArea();
        double t_area = triangle.calculateArea();

        System.out.println("Area of Circle: " + c_area);
        System.out.println("Area of Rectangle: " + r_area);
        System.out.println("Area of Triangle: " + t_area);
        
    }
    
}
