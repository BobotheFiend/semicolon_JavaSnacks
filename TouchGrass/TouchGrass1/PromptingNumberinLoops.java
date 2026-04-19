import java.util.Scanner;
public class PromptingNumberinLoops{
    public static void main(String[] args){
    Scanner inputNumbers = new Scanner(System.in);

        int count = 0;
        //int countTwo = 0;
        int total = 0;
        System.out.print("Enter a number: ");
        int numbers = inputNumbers.nextInt();
        while(numbers > 0){
            total += numbers;
            count++;
            System.out.printf("%s%d%s%d%n","The total is: ", total,"The iteration times is: ", count);
            if (numbers > 0)
                System.out.print(" Enter a number again: ");
                numbers = inputNumbers.nextInt();
            
                if (numbers < 0)
                break;
        }
        int average = total / count;
        System.out.printf("%s%d%n", "Your average of all positive numbers = ", average);
    }
}
