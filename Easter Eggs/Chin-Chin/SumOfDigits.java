import java.util.Scanner;

public class SumOfDigits{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number from 100-999: ");
        int three = input.nextInt();

        int digit1 = three/10;
        int digitRem1 = three % 10;

        int digit2 = digit1/10;
        int digitRem2 = digit1 % 10;
    
        int digit3 = digit2/10;
        int digitRem3 = digit2 % 10;
        
        int sum = digitRem1+digitRem2+digitRem3;
        
        System.out.printf("The Sum of its digits = %d%n", sum);
       
    }
}
