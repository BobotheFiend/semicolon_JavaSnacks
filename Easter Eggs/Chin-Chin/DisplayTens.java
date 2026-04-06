
import java.util.Scanner;

public class DisplayTens{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number from 10-99: ");
        int digit = input.nextInt();

        
        int tens = digit/10;
        int unit = digit % 10;
        
        if (tens > unit){
        System.out.printf("The tens %d > the unit %s%n", tens, unit);
        }

        if (tens < unit){
        System.out.printf("The tens %d < the unit %s%n", tens, unit);
        }

        if (tens == unit){
        System.out.printf("The tens %d = the unit %s%n", tens, unit);
        }
    }
}
