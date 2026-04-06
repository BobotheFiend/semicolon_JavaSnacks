import java.util.Scanner;

public class DisplayTwoDouble{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num1 = input.nextInt();

        System.out.print("Enter number: ");
        int num2 = input.nextInt();

        if (num1 > num2 || num2 > num1){
        System.out.printf("%d is the larger value%n", Math.max(num1,num2));
        }
        if (num1 < num2 || num2 < num1){
        System.out.printf("%d is the smaller value%n", Math.min(num1,num2));
        }
        System.out.printf("The sum = %d%nThe subtraction = %d%nThe product = %s%n", num1+num2, num1-num2, num1*num2);
        if (num2 == 0){
        System.out.printf("Errror! no Quotient%n");
        }
        else if (num1 % num2 == 0){
        System.out.printf("The quotient = %d%n", num1/num2);
        }
    }
}
