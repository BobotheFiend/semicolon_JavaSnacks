import java.util.Scanner;
public class FigureAndSum{
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = inputCollector.nextInt();
        int sum = 0;
        int digitRem = 0;
        int digit = 0;
     
         for (; userInput > 0; ){

            digitRem = userInput % 10;
            //digit = userInput / 10;
   
        sum += digitRem;
        userInput = userInput / 10;
        System.out.printf("%d%s%d%n", userInput, " ... ", digitRem);
        }
            System.out.printf("%d%n", sum);
    }
}
