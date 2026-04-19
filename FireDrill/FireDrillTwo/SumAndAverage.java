import java.util.Scanner;
public class SumAndAverage{
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
        
        int scores = 0; 
        int sum = 0;
        int average = 0;
        int count = 1;
        for(; count<= 10; count++){
        System.out.printf("Enter a number: ");
        scores = inputCollector.nextInt();

        System.out.printf("%d%n", scores);
        sum += scores;
        
            System.out.printf("%n%d%s%n",sum, " = The sum of all the numbers");
        }
        average = sum/10;
System.out.printf("%d%s%n", average, " = the Average of the 10 scores");

    }
}
