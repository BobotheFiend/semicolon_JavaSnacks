import java.util.Scanner;
public class ValidScoreAndSum{
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
        
        int scores = 0; 
        int sum = 0;
        int count = 1;
        //int denominator = 0;
        //double average = 0;

        for(; count<= 10;){
            System.out.print("Enter a number: ");
            scores = inputCollector.nextInt();
            if (scores > 0 && scores <= 100){
            
            sum += scores;
            count++;
            }
               System.out.printf("%d%s%n",count, " The indexs of all the numbers");
        }
              System.out.printf("%d%s%n",sum, " The total of all the numbers");
        //denominator++;
        //System.out.printf("%d%n", count);
           
        //sum += scores; 
            //System.out.printf("%d%s%n",sum, " The indexs of all the numbers");
        //System.out.printf("%d%s%n", sum, " = the sum of the scores");

        //average = sum/denominator; 
        //System.out.printf("%s%.1f%n","The average = ", average);

        
    
    }
}
