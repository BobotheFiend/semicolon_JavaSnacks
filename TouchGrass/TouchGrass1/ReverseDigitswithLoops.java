import java.util.Scanner;
public class ReverseDigitswithLoops{
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = inputCollector.nextInt();
        int sum = 0;
        int digitRem = 0;
        int digit = 0;
     
         while (userInput > 0){

        digitRem = userInput % 10;
        userInput = userInput / 10;
        System.out.printf("%d%s%d%n", userInput, " ... ", digitRem);
        }
    }
}
