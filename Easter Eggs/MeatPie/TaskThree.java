import java.util.Scanner;

public class TaskThree{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter Number: ");
        double num1 = inputNum.nextDouble();

        System.out.print("Enter Number: ");
        double num2 = inputNum.nextDouble();

        System.out.printf("%s %f%n", "The sum =", num1+num2);

    }

}
