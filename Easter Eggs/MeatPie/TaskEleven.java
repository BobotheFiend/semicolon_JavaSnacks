import java.util.Scanner;

public class TaskEleven{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = inputNum.nextInt();

        System.out.printf("%s%f%n", "The half of the number = ", num/2f);

    }

}
