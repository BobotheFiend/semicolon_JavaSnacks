import java.util.Scanner;
public class FindtheTwoLargestNumber{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inputCollector.nextInt();

        int largest = number;
        int secondLargest = number;
        int count = 1;
        
        for(; count <=10; count++){
            
            System.out.print("Enter number: ");
            number = inputCollector.nextInt();
            if (number < secondLargest)
            largest = number;
            System.out.printf("   The current Largest number is %d%n     The current second largest number is %s%n ", largest,secondLargest);
        }

            System.out.printf("The Largest number is %d%n", largest);
    }
}
