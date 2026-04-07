import java.util.Scanner;

public class TaskFour{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number from 10-99: ");
        int num1 = input.nextInt();

        System.out.print("Enter a number from 10-99: ");
        int num2 = input.nextInt();

        if (num2 % num1 == 0){
        System.out.printf("%d is a multiple of %d%n", num1, num2);
        } else{
          System.out.printf("%d is NOT a multiple of %d%n", num1, num2);
          }
    }
}
