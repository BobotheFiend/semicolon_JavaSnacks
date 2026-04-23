import java.util.Scanner;
public class PalindromeofFive{
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a five digit number: ");
        int number = inputCollector.nextInt();

        int firstDigitExtracted = number % 10;
        int firstDigit = number / 10;

        int secondDigitExtractor = firstDigit % 10;
        int secondDigit = firstDigit / 10;

        int thirdDigitExtractor = secondDigit % 10;
        int thirdDigit = secondDigit / 10;

        int fourthDigitExtractor = thirdDigit % 10;
        int fourthDigit = thirdDigit / 10;

        int fifthDigitExtractor = fourthDigit % 10;
        int fifthDigit = fourthDigit / 10;

        if (firstDigitExtracted == fifthDigitExtractor && secondDigitExtractor == fourthDigitExtractor){
            System.out.printf("%d---->%d%d%d%d%d%n It's Palindrome%n", number, firstDigitExtracted,secondDigitExtractor,thirdDigitExtractor,fourthDigitExtractor,fifthDigitExtractor);
        }

        else {
            System.out.printf("%d ----> %d%d%d%d%d%n Is not a Palindrome%n", number, firstDigitExtracted,secondDigitExtractor,thirdDigitExtractor,fourthDigitExtractor,fifthDigitExtractor);
        }
    }
}
        
