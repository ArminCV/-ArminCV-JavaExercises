import java.util.Scanner;

public class Factorial
{

    public int CalculateFactorial(int num)
    {
       if(num >= 1)
       {
        return (num * CalculateFactorial(num-1));
       } else{
        return 1;
       }
    }

    public void DisplayFactorial(int num)
    {
        int i = 1;
        int factorial = 1;
        while(i <= num)
        {
            System.out.println(i + "! = " + (factorial *= i));
           
            i++;
        }
    }

    public static void main(String[] args)
    {
        try
        {
            Factorial obj = new Factorial();
            Scanner input = new Scanner(System.in);
            int num, result;
            System.out.print("Enter an integer to calculate it's factorial: ");
            num = input.nextInt();
            result = obj.CalculateFactorial(num);
            obj.DisplayFactorial(num);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
        }
    }
}