package JavaInheritance.Exercise3;

public class Main {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(3.0, 10.0);
        double area = rectangle.getArea();
        System.out.println("The area of the recatngle is " + area);
    }
}
