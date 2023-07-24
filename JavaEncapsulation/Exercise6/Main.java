package JavaEncapsulation.Exercise6;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.setCompanyName("Chevrolet");
        car.setModelName("Curze");
        car.setYear(2009);
        car.setMileage(0.0);

        String company_name = car.getCompanyName();
        String model_name = car.getModelName();
        int year = car.getYear();
        double mileage = car.getMileage();

        System.out.println("Company Name: " + company_name);
        System.out.println("Model Name: " + model_name);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        
    }
    
}
