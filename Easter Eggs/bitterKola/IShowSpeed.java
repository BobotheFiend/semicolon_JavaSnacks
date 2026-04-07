import java.util.Scanner;

public class IShowSpeed{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed km/h: ");
        int num = input.nextInt();

        if (num == 0){
        System.out.printf("Stationary%n");
        } 
        if (num >= 1 && num <= 40){
        System.out.printf("Slow%n");
        } 
        if (num >= 40 && num <= 80){
        System.out.printf("Moderate%n");
        }      
        if (num >= 80 && num <= 120){
        System.out.printf("Fast%n");
        }
        if (num > 120){
        System.out.printf("Dangerously Fast%n");
        }
    }
}
