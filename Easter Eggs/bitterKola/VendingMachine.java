import java.util.Scanner;

public class VendingMachine{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter product code 1-4 : ");
        int num = input.nextInt();

        System.out.print("Enter amount tendered: ");
        int amount = input.nextInt();

        int waterChg = amount-100;
        int juiceChg = amount-200;
        int sodaChg = amount-150;
        int snackChg = amount-300;
        
        if (num > 4){
        System.out.printf("Not a valid entry");
        }        
        if (num == 1){ 
        }else if( waterChg >= 0){
         System.out.printf("sufficenct for water%n");
         } else {
           System.out.printf("amount is insufficent%n");
           }
        if (num == 2){ 
        }else if( juiceChg >= 0){
         System.out.printf("sufficenct for juice%n");
         } else {
           System.out.printf("amount is insufficent%n");
           }
        if (num == 3){ 
        }else if( sodaChg >= 0){
         System.out.printf("sufficenct for soda%n");
         } else {
           System.out.printf("amount is insufficent%n");
           }
        if (num == 1){ 
        }else if( snackChg >= 0){
         System.out.printf("sufficenct for snack%n");
         } else {
           System.out.printf("amount is insufficent%n");
           }
    }
}
