import java.util.Scanner;

public class TaskTwentyEight{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = inputNum.nextInt();

        float div = num/3f;
        System.out.printf("%s %f%n", "divided by 3 = ", div);

    }

}
