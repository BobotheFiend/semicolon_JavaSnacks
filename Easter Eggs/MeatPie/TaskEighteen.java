import java.util.Scanner;

public class TaskEighteen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = inputNum.nextInt();

        int minus = num-5;
        System.out.printf("%d%s %d%n", num, " minus 5 = ", minus);

    }

}
