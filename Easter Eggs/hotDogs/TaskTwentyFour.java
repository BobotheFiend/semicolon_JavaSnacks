import java.util.Scanner;

public class TaskTwentyFour{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Exchage rate of $ to RMB = 1 Dollar$ = 6.88 Rmb (true/flase) : ");
        boolean ans = input.nextBoolean();

        if (ans==false){ 
        System.out.printf("Goodbye%n");        
        }        
        if (ans == true) System.out.print("Enter exchage value $ or RMB: ");
        double value = input.nextDouble();        

        double dollarToRmb = value*6.88;

        double rmbToDollar = value*0.15;

        double convert0 = dollarToRmb;
        double convert1 = rmbToDollar;

        System.out.print("Input 0 to convert to RMB or press 1 to skip: ");
        int choice1 = input.nextInt();

        System.out.print("Input 1 to convert to $ : ");
        int choice2 = input.nextInt();

        if (choice1==0){
        System.out.printf("The exchange rate to RMB = %f%n", convert0);
        } else{ 
           System.out.printf("Skipping...");
           }
        if (choice2==1){
        System.out.printf("The exchange rate to Dollar = %f%n", convert1);
        } else{ 
           System.out.printf("End");
           }
    }
}
