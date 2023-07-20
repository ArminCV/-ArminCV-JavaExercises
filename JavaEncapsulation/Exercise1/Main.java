package JavaEncapsulation.Exercise1;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Juan Dela Cruz");
        person.setAge(25);
        person.setCountry("Philippines");

        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
    
}
