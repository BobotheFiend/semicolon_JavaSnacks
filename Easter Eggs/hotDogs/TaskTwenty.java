import java.util.Scanner;

public class TaskTwenty{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter drive distance: ");
        double distance = inputNum.nextDouble();        
        System.out.print("Enter fuel efficiency: ");
        double fuel = inputNum.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = inputNum.nextDouble();

        double costPrice = (distance/fuel)*price;
        
        System.out.printf("The future investment value = %.1f%n", costPrice);
    }
}
