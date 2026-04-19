import java.util.Scanner;
public class EvenSumOfScoreAndAverage{
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
        
        int scores = 0; 
        int sum = 0;
        int count = 1;
        int denominator = 0;
        double average = 0;

        for(; count<= 10; count++){
        System.out.print("Enter a number: ");
        scores = inputCollector.nextInt();

        if (scores % 2 == 0){
        
        sum += scores;
        denominator++;
        //System.out.printf("%d%n", count);
        }
        //sum += scores;
        
            System.out.printf("%d%s%n",count, " The indexs of all the numbers");
        }
           
        System.out.printf("%d%s%n", sum, " = the sum of the even scores");

        average = sum/denominator; 
        System.out.printf("%s%.1f%n","The average = ", average);

        
    
    }
}
