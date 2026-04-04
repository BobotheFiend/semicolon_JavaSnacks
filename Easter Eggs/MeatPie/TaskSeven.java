import java.util.Scanner;

public class TaskSeven{

    public static void main(String[] args){

        Scanner inputSquare = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int square = inputSquare.nextInt();
 
        System.out.printf("%s %d%n", "The Sqaure of the number =", square*square);

    }

}
