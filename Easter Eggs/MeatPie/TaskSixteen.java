import java.util.Scanner;

public class TaskSixteen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = inputNum.nextInt();

        int five = num*5;
        System.out.printf("%d%s%d%n", num, " * 5 = ", five);

    }

}
