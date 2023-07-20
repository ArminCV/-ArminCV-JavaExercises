package JavaEncapsulation.Exercise5;

public class Main {

    public static void main(String[] args) {
        
        Circle circle = new Circle();
        
        circle.setRadius(7.0);

        double radius = circle.getRadius();
        double area = circle.calculateArea(radius);
        double perimeter = circle.calculatePerimeter(radius);

        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + area);
        System.out.println("Circle Perimeter: " + perimeter);
        
    }
    
}
