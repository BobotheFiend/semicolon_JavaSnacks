import java.util.Scanner;

public class TaskTwentyFour{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = inputNum.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = inputNum.nextInt();

        int num3 = num2;
        int num4 = num1;

        System.out.printf("%s%d%n%s%d%n", "The First number is: ", num3, "The Second number is: ", num4);

    }

}
