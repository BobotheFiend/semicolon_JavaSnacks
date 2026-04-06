import java.util.Scanner;

public class DisplayATM{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your four digit pin: ");
        int pin = input.nextInt();

        if (pin == 1234){
        System.out.printf("Your account balance is: $1,000%n");
        } else {
        System.out.printf("Incorrect PIN!%n");
        }
    }
}
