package JavaEncapsulation.Exercise3;

public class Main {

    public static void main(String[] args) {
        
        Rectangle rec = new Rectangle();

        rec.setLength(6.7);
        rec.setWidth(12.0);

        double length = rec.getLength();
        double width = rec.getWidth();

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);

    }
    
}
