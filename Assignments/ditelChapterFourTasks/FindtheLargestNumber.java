import java.util.Scanner;
public class FindtheLargestNumber{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = inputCollector.nextInt();

        int largest = number;
        int count = 1;
        
        for(; count <=10; count++){
            
            System.out.print("enter first number: ");
            number = inputCollector.nextInt();
            if (number > largest)
            largest = number;
            System.out.printf("The cureent Largest number is %d ", largest);
        }

            System.out.printf("The Largest number is %d%n", largest);
    }
}
