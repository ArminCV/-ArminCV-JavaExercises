package JavaPolymorphism.Exercise3;

public class Triangle extends Shape{

    private double base;
    private double height;

    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public double calculateArea()
    {
        double area = (base * height) / 2;
        return area;
    }
    
}
