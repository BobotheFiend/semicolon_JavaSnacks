import java.util.Scanner;

public class ValidateDate{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter day: ");
        String day = input.nextLine();

        System.out.print("Enter Month: ");
        int month = input.nextInt();

        System.out.print("Enter Year: ");
        int years = input.nextInt();

        if (day == "Monday""Tuesday""Wednesday""Thursday""Friday""Saturday""Sunday" && month >= 1 && month <= 12 ){
        System.out.printf("The date is %s/%d/%d", day, month, year);
        } 
        else {
        System.out.printf("Invalid Pin!%n");
        }
    }
}
