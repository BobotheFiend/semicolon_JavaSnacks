import java.util.Scanner;

public class TaskTwo{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number from 10000-99999: ");
        int five = input.nextInt();

        int digit1 = five/10;
        int digitRem1 = five % 10;

        int digit2 = digit1/10;
        int digitRem2 = digit1 % 10;
    
        int digit3 = digit2/10;
        int digitRem3 = digit2 % 10;

        int digit4 = digit3/10;
        int digitRem4 = digit3 % 10;
        
        int digit5 = digit4/10;
        int digitRem5 = digit4 % 10;

        System.out.printf("the sum of %d ---> %d%n", five, digitRem5+digitRem1);
    }
}
