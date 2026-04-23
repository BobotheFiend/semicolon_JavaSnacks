//if a salesperson earns 200 every week which is every 7 days
//in that seven days the gross sales they make every week, they get 9%
//in this problem we have four items
//create an input collector
//we collect the gross sales for last week 
//the amountcollected is multiplied by 0.09 to know the cut from the each gross amount
//the add 200 to the amount collected to get the total amount"""

import java.util.Scanner;
public class SalesCommissionCalculator{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);

        int totalAmount = 0;
        //int count = 1;

        System.out.print("Enter the amount of items sold: ");
        double amountCollected = inputCollector.nextDouble();

        double ninePercentCut = 0;
        while (amountCollected != -1){
            ninePercentCut = amountCollected * 0.09;
            totalAmount = 200 + (int)ninePercentCut;

            System.out.printf("Your earning is %d%n", totalAmount);

            System.out.print("Enter the amount of items sold: ");
            amountCollected = inputCollector.nextDouble();

         //count++;
        }
    }
}       

