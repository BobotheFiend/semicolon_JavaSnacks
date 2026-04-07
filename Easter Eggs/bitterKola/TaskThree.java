import java.util.Scanner;

public class TaskThree{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter price: ");
        int price = input.nextInt();
        System.out.print("Enter discount percentage: ");
        int dp = input.nextInt();

        double discountAmount = price*dp*0.01;
        double finalPrice = price-discountAmount;

        System.out.printf("The final price = %.0f%n ", finalPrice);

    }
}

