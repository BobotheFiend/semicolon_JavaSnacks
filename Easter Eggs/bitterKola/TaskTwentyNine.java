import java.util.Scanner;

public class TaskTwentyNine{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num1 = input.nextInt();
        System.out.print("Enter number: ");
        int num2 = input.nextInt();

        if (num1 < num2){
        System.out.printf("%d is closer to zero than %d%n", num1, num2);
        }   else if (num1 > num2){
            System.out.printf("%d is closer to zero than %d%n", num2, num1);
            }   else{
                System.out.printf("They are both equally close to zero%n");
                }
    }
}
