import java.util.Scanner;
public class ScoresandSum{
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
        
        int scores = 0; 
        int sum = 0;

        for(; scores <= 10; scores++)
        System.out.printf("Enter a number: ");
        scores = inputCollector.nextInt();

        System.out.printf("%d%n", scores);

        


    }
}
