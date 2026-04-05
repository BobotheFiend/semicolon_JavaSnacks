import java.util.Scanner;

public class TaskSeven{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter a number from 0-1000: ");
        int num = inputNum.nextInt();

        int digit1 = num % 10;
        int remDigit1 = num/10;

        int digit2 = remDigit1%10;
        int remDigit2 = remDigit1/10;

        int digit3 = remDigit2%10;
        int remDigit3 = remDigit2/10;

        int sum = digit1+digit2+digit3;

        System.out.printf("%d is the sum%n", sum);
        

    }
}
