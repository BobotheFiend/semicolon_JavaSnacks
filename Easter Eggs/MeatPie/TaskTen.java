import java.util.Scanner;

public class TaskTen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int two = inputNum.nextInt();

        System.out.printf("%s%d%n", "The double of the number = ", two*two);

    }

}
