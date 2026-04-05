import java.util.Scanner;

public class TaskTwentyNine{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter a score from (0-100): ");
        int number = inputNum.nextInt();


        if (number >= 90%100){
        System.out.printf("%d = Your grade is A%n", number);
        } else if(number >100){
          System.out.print("not valid");
          }

        else if (number >= 80%89){
        System.out.printf("%d = Your grade is B%n", number);
        }

        else if (number >= 70%79){
        System.out.printf("%d = Your grade is C%n", number);
        }

        else if (number >= 60%69){
        System.out.printf("%d = Your grade is D%n", number);
        }

        else if (number < 60){
        System.out.printf("%d = Your grade is F%n", number);
        }
    }
}
