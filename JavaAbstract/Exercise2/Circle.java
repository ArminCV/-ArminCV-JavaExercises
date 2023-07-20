package JavaAbstract.Exercise2;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
        
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    
}
