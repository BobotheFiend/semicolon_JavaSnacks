import java.util.Scanner;

public class TaskEighteen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter Balance: ");
        double balance = inputNum.nextDouble();        
        System.out.print("Enter Annual% Interest Rate: ");
        double interestRate = inputNum.nextDouble();

        double air = interestRate*12/1200;
        double interest = balance*air;

        System.out.printf("The intrest for next month = %f%n", interest);
    }
}
