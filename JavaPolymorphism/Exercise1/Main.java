package JavaPolymorphism.Exercise1;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        //Animal b = new Bird();
        //Animal c = new Cat();

        animal.makeSound();
        bird.makeSound();
        cat.makeSound();
    }
    
}
