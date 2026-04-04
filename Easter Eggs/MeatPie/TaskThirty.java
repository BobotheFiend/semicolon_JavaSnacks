import java.util.Scanner;

public class TaskThirty{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number");
        int num1 = input.nextInt();

        System.out.println("Enter Number");
        int num2 = input.nextInt();

        int sum = num1+num2;
        int multiply = num1*num2;

        System.out.printf("%s%d%n%s%d%n", "The sum = ", sum, "The multiple = ", multiply);

    }
}
