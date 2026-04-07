import java.util.Scanner;

public class ValidateAtm{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter pin for validation 1000-9999: ");
        int num = input.nextInt();

        if (num >= 1000 && num <= 9999 ){
        System.out.printf("Pin Validated!%n");
        } 
        else {
        System.out.printf("Invalid Pin!%n");
        }
    }
}
