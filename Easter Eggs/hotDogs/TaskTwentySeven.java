import java.util.Scanner;

public class TaskTwentySeven{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = inputNum.nextInt();

        if (num % 2 == 0){
        System.out.printf(" %d is divisible by 2 %n", num);
        }  if (num % 3 == 0){
            System.out.printf(" %d is divisible by 3 %n", num);
            }  if (num % 5 == 0){
                System.out.printf(" %d is divisible by 5 %n", num);
                }   if (num % 7 == 0){
                    System.out.printf(" %d is divisible by 7 %n", num);
                    }

    }
}
