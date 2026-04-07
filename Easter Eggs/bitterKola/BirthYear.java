import java.util.Scanner;

public class BirthYear{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Birth year: ");
        int birthYr = input.nextInt();
        System.out.print("Enter Current Year: ");
        int currentYr = input.nextInt();

        int birthDay = currentYr-birthYr;

        if (birthDay >= 65){
        System.out.printf("You are %d%s and Eligible for the senior citizen discounts%n", birthDay, "years old");
        } if (birthDay >= 0 && birthDay <65){
        System.out.printf("You are %d%s and NOT eligible for the senior citizen discounts%n", birthDay, "years old");
        } 
    }
}
