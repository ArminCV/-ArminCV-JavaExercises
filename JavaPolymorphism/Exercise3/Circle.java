package JavaPolymorphism.Exercise3;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public double calculateArea()
    {
        double area = Math.PI * radius * radius;
        return area;
    }
    
}
