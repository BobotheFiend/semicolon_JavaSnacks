import java.util.Scanner;

public class TaskFourteen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num1 = inputNum.nextInt();

        System.out.print("Enter Number: ");
        int num2 = inputNum.nextInt();

        System.out.print("Enter Number: ");
        int num3 = inputNum.nextInt();

        double average = num1+num2+num3/3;
        System.out.printf("%s %f%n", "The average = ", average);

    }

}
