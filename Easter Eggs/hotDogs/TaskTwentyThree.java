import java.util.Scanner;

public class TaskTwentyThree{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter a 3 digit number: ");
        int num = inputNum.nextInt();        
        
        int digit1 = num % 10;
        int digit2 = digit1 % 10;
        int digit3 = digit2 % 10;

        System.out.printf("%d%d%d%n", digit1,digit2,digit3);
        
    }
}
