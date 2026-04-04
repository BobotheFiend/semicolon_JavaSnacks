import java.util.Scanner;

public class TaskTwo{

    public static void main(String[] args){

        Scanner inputAge = new Scanner(System.in);

        System.out.print("What's your age: ");
        int age = inputAge.nextInt();

        System.out.printf("You are %s years old%n", age);

    }

}
