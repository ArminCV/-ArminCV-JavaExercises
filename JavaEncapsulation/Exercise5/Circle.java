package JavaEncapsulation.Exercise5;

public class Circle {

    private double radius;

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double calculateArea(double radius)
    {
        return Math.PI * radius * radius;
    }
    
    public double calculatePerimeter(double radius)
    {
        return 2 * Math.PI * radius;
    }
}
