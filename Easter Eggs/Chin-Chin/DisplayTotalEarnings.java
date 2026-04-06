import java.util.Scanner;

public class DisplayTotalEarnings{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter hourly wage: ");
        int hrsWage = input.nextInt();

        System.out.print("Enter number of hours worked: ");
        int numHrs = input.nextInt();
       
        double rightSide = hrsWage*1.5;
        double mSide = numHrs - 40;        
        double tHours = mSide*rightSide;
        double left = 40*hrsWage;
        double totEarn = left + tHours;

        System.out.printf("The total earnings = %.1f%n", totEarn);
        
    }
}
