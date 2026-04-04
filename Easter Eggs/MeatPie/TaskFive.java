import java.util.Scanner;

public class TaskFive{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num1 = inputNum.nextInt();

        System.out.print("Enter Number: ");
        int num2 = inputNum.nextInt();

        System.out.printf("%s %d%n", "The Multiple = ", num1*num2);

    }

}
