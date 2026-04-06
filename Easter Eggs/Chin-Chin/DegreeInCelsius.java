import java.util.Scanner;

public class DegreeInCelsius{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the degree in celcius: ");
        int temp = input.nextInt();

        if (temp < 0){
        System.out.printf("the degree is %d%s%nIts FREEZING!%n", temp,"C");
        }

        if (temp > 0 && temp <= 15){
        System.out.printf("the degree is %d%s%nIts COLD!%n", temp,"C");
        }
        if (temp > 15 && temp <= 25){
        System.out.printf("the degree is %d%s%nIts WARM!%n", temp,"C");
        }
        
        if (temp > 25){
        System.out.printf("the degree is %d%s%nIts HOT!%n", temp,"C");
        }     
    }
}
