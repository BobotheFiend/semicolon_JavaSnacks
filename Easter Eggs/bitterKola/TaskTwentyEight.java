import java.util.Scanner;

public class TaskTwentyEight{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 3digit number 100-999: ");
        int num = input.nextInt();

        int digit1 = num/10;
        int digitRem1 = num % 10;

        int digit2 = digit1/10;
        int digitRem2 = digit1 % 10;

        int digit3 = digit2/10;
        int digitRem3 = digit2 % 10;
        
        int sum = digitRem1+digitRem2+digitRem3;

        if (num % sum == 0){
            System.out.printf("the digit %d is divisible by %d%n", num, sum);
        } else {
            System.out.printf("NOT divisibe%n");
            }
    }
}
