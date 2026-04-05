import java.util.Scanner;

public class TaskOne{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter the miles: ");
        int numMiles = inputNum.nextInt();

        double kiloMeters = 1.6*numMiles;

        System.out.printf("%d%s is %.2f%s%n", numMiles, "m", kiloMeters, "km");
        

    }
}
