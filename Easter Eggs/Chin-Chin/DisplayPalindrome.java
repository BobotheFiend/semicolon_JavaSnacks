import java.util.Scanner;

public class DisplayPalindrome{

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

        if (digitRem1 == digitRem3){
        System.out.printf("%d ---> %d%d%d, the number is a Palindrome%n", three, digitRem1,digitRem2,digitRem3);
        }   
        else {
        System.out.printf("%d ---> %d%d%d, the number is not a Palindrome%n", three, digitRem1,digitRem2,digitRem3);
        }
    }
}
