import java.util.Scanner;

public class DisplayMonth{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number from 1-12 to display month name: ");
        int month = input.nextInt();

        if (month == 1){
        System.out.printf("The month is: JANUARY%n");
        } 
        if (month == 2){
        System.out.printf("The month is: FEBUARY%n");
        }
        if (month == 3){
        System.out.printf("The month is: MARCH%n");
        }
        if (month == 4){
        System.out.printf("The month is: APRIL%n");
        }
        if (month == 5){
        System.out.printf("The month is: MAY%n");
        }if (month == 6){
        System.out.printf("The month is: JUNE%n");
        }
        if (month == 7){
        System.out.printf("The month is: JULY%n");
        }
        if (month == 8){
        System.out.printf("The month is: AUGUST%n");
        }
        if (month == 9){
        System.out.printf("The month is: SEPTEMBER%n");
        }
        if (month == 10){
        System.out.printf("The month is: OCTOBER%n");
        }
        if (month == 11){
        System.out.printf("The month is: NOVEMBER%n");
        }
        if (month == 12){
        System.out.printf("The month is: DECEMBER%n");
        }else {
         System.out.printf("Incorrect INPUT!%n");
         }
    }
}
