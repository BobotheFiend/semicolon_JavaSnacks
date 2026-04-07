import java.util.Scanner;

public class FactorFirstNumber{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num1 = input.nextInt();

        System.out.print("Enter number: ");
        int num2 = input.nextInt();

        if (num2 % num1 == 0){
        System.out.printf("%d which is the first integer is a factor of the second %d%n", num1, num2);
        }   else {
            System.out.printf("%d is not a factor of %d%n", num1, num2);
            }
    }
}
