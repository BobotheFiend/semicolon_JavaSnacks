import java.util.Scanner;

public class TaskTwentySix{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String nameInput = input.nextLine();

        System.out.print("Enter your age : ");
        int ageInput = input.nextInt();

        System.out.printf("I am %s and I am %d years old.%n", nameInput, ageInput);

    }

}
