package JavaPolymorphism.Exercise2;

public class Bicycle extends Car{

    @Override
    public void speedUp()
    {
        super.speedUp();
        System.out.println("Bicycle speed increased by 12 units");
    }
    
}
