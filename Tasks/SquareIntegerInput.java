import java.util.Scanner;
public class SquareIntegerInput{
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter an input: ");
        int userInput = inputCollector.nextInt();

        int square = 0;
        int digitRem = 0;
        int digit = 0;
        
        for (; userInput > 0; ){

             digitRem = userInput % 10;
            //digit = userInput / 10;
   
        square = digitRem*digitRem;
        userInput = userInput / 10;
        
        //System.out.printf("%d%s%d%s%d%n", userInput, " ... ", digitRem,"...", digitRem*digitRem);
        System.out.printf("%d%n", square);
                //System.out.printf("%d%s%d%n", digitRem, " ... ", square);
        }
            //System.out.printf("%d%n", square);

    }
}
