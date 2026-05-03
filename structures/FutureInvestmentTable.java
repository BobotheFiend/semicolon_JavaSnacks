public class FutureInvestmentTable{
    public static void main(String[] args){
    java.util.Scanner input = new java.util.Scanner(System.in);
    
        System.out.print("Enter Investment Amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter yearly intrest rate: ");
        double annualInterestRate = input.nextDouble();
        int years = 30;
        System.out.printf("%n");
        //System.out.printf("%s = %.2f (after 30 years)%n","Future Investment",futureInvestmenValue(investmentAmount, annualInterestRate, years));
        futureInvestmenValue(investmentAmount, annualInterestRate, years);
    }

    public static double futureInvestmenValue(double investmentAmount, double annualInterestRate, int years){

        double monthlyIntrestRate =  (annualInterestRate/100) /12;
        int count = 1;
        double futureInvestment = 0;
        for(;count <= years; count++){
            futureInvestment = investmentAmount * Math.pow((1 + monthlyIntrestRate), count*12);
            System.out.printf("%s%dyear(s) = %.2f%n","Future Investment after ",count, futureInvestment);
        }
        return futureInvestment;
    }
}

