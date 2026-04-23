import java.util.Scanner;
public class CreditLimitCalculator{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter balance for beginning of month: ");
        int monthBalance = inputCollector.nextInt();

        System.out.print("Enter totalcharges for month: ");
        int totalCharges = inputCollector.nextInt();

        System.out.print("Enter customer total credit applied for month: ");
        int customerCreditApplication = inputCollector.nextInt();

        System.out.print("Enter allowed credit for month: ");
        int allowedCreditLimit = inputCollector.nextInt();

        int currentBalance = monthBalance + totalCharges + customerCreditApplication;

        if (currentBalance > allowedCreditLimit){
            System.out.printf("  Your CRedit Limit HAS been Exceeded!   %n");
        }
        else {
            System.out.printf("  Your CRedit Limit has NOT been Exceeded!  %n");
        }
    }
}
        

