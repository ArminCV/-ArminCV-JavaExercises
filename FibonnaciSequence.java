import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonnaciSequence{

    public int num, currentNum, previousNum, temp;
    final static int NUMBER_ONE = 1;

    public void FibSeq(int number){
        System.out.println("**********");
        for(int i = 0; i < num; i++){
            if(i == 0){
                currentNum = i;
            } else if(i == 1 || i == 2){
                currentNum = 1;
                previousNum = 1;
            }
            else{
                temp = currentNum;
                currentNum = currentNum + previousNum;
                previousNum = temp;
            }
            System.out.println(currentNum);
        }
    }

    public void Display(){
        try{
            Scanner input = new Scanner(System.in);
            System.out.print("Enter The Number of Terms: ");
            num = input.nextInt();
            FibSeq(num);

        }catch(InputMismatchException ex){
            System.out.println(ex);
        }
    }

    public static void main(String[] args){
        FibonnaciSequence obj = new FibonnaciSequence();
        obj.Display();
    }

}