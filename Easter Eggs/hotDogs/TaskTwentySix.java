import java.util.Scanner;

public class TaskTwentySix{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int num = inputNum.nextInt();

        if (num % 400 == 0){
        System.out.printf(" %d is a leap year%n", num);
        }   else if (num % 3 != 0){
            System.out.printf(" %d is not a leap year%n", num);
            }
    }
}
