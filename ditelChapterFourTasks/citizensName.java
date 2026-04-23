import java.util.Scanner;
public class TaxCalculator{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter citizens name:  ");
        String citizensName = inputCollector.nextLine();

        System.out.print("Enter Years Earnings:  ");
        int earnings = inputCollector.nextInt();

        while (earnings != 0 ){

            if (earnings <= 30000){
                double taxAmount = earnings * 0.15;
                System.out.printf("%s , Your tax to pay for the year is %.2f%n", citizensName, taxAmount);
            }
            else {
                double taxAmount = earnings * 0.20;
                System.out.printf("%s , Your tax to pay for the year is %.2f%n", citizensName, taxAmount);
            }    

            System.out.println("Enter citizens name:  ");
            citizensName = inputCollector.nextLine();

            System.out.print("Enter Years Earnings:  ");
            earnings = inputCollector.nextInt();
        }
    }
}
