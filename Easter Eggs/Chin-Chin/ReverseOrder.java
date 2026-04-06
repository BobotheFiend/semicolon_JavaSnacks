import java.util.Scanner;

public class ReverseOrder{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number from 1000-9999: ");
        int four = input.nextInt();

        int digit1 = four/10;
        int digitRem1 = four % 10;

        int digit2 = digit1/10;
        int digitRem2 = digit1 % 10;
    
        int digit3 = digit2/10;
        int digitRem3 = digit2 % 10;

        int digit4 = digit3/10;
        int digitRem4 = digit3 % 10;
        
        System.out.printf("%d ---> %d%d%d%d%n", four, digitRem1,digitRem2,digitRem3,digitRem4);
       
    }
}
