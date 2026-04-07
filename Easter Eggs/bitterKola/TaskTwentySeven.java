import java.util.Scanner;

public class TaskTwentySeven{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Bank Balance ");
        double bal = input.nextDouble();

        System.out.print("Enter annual intrest rate ");
        int rate = input.nextInt();

        double convRate = rate/100;
        double rightSide = bal*(1 + convRate);
        double compoundIntrest1 = Math.pow(rightSide,1);
        double compoundIntrest2 = Math.pow(rightSide,2);
        double compoundIntrest3 = Math.pow(rightSide,3);

        System.out.printf("compound Intrest after 1 year = %.2f%nCompound Intrest after 2 years = %.2f%nCompound Intrest after 3 year = %.2f%n",compoundIntrest1, compoundIntrest2, compoundIntrest3 );

    }
}

