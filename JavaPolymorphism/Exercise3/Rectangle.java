package JavaPolymorphism.Exercise3;

public class Rectangle extends Shape{

    private double width, length;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double calculateArea()
    {
        double area = (length * width);
        return area;
    }
    
}
