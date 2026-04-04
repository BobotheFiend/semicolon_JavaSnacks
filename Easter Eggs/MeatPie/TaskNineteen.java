import java.util.Scanner;

public class TaskNineteen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = inputNum.nextInt();

        float div = num/2f;
        System.out.printf("%d%s %f%n", num, " divide by 2 = ", div);

    }

}
