import java.util.Scanner;

public class TaskSeventeen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = inputNum.nextInt();

        int ten = num+10;
        System.out.printf("%d%s%d%n", num, " +10 = ", ten);

    }

}
