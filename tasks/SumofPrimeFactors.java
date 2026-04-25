import java.util.Scanner;
public class SumofPrimeFactors{
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        int count = 2;
        int total = 0;
 
        for (;count <= number;){
          if (number % count == 0){
            System.out.printf("%s%d%s%d%n","The Factors of ", number, " are: ", count );
            number = number/count;
            total += count;
                }
                
          else {
            count++;
          }
        
        } 
        System.out.printf("The sum of the factors are %d%n", total);
    }        
}       
