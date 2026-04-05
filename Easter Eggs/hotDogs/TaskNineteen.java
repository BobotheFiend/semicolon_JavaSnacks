import java.util.Scanner;

public class TaskNineteen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double investAmount = inputNum.nextDouble();        
        System.out.print("Enter Annual% Interest Rate: ");
        double annualIntrestRate = inputNum.nextDouble();
        System.out.print("Enter years: ");
        double years = inputNum.nextDouble();

        double monthlyIntrest = annualIntrestRate/1200;
        double futureInvestment = investAmount*Math.pow(1+monthlyIntrest, years*12);

        System.out.printf("The future investment value = %.0f%n", futureInvestment);
    }
}
