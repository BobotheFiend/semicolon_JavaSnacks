import java.util.Scanner;

public class TaskTwentySix{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number from 10-99: ");
        int num = input.nextInt();

        int digit1 = num/10;
        int digitRem1 = num % 10;

        int digit2 = digit1/10;
        int digitRem2 = digit1 % 10;

        if (digitRem1 > digitRem2){
        System.out.printf("Reversing the number %d, %d is larger than %d%n", num, digitRem1, digitRem2);
        }   
        else if (digitRem1 < digitRem2){
        System.out.printf("Reversing the number %d, %d is the smaller number%n", num, digitRem1);
        }   
        if (digitRem1 == digitRem2){
        System.out.printf("The numbers %d are the same %d%n", num, digitRem2);
        }   
 
    }
}
