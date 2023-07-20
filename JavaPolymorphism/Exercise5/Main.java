package JavaPolymorphism.Exercise5;

public class Main {

    public static void main(String[] args) {
        
        Sports sports = new Sports();
        Sports football = new Football();
        Sports basketball = new Basketball();
        Sports rugby = new Rugby();

        sports.play();
        football.play();
        basketball.play();
        rugby.play();

    }
    
}
