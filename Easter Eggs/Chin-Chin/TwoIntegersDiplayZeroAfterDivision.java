import java.util.Scanner;

public class TwoIntegersDiplayZeroAfterDivision{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int m = input.nextInt();

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        if (n == 0){
        System.out.printf("Error! it cannot not gooo!%n");
        }
        else if (m % n == 0){
        System.out.printf("if %d divided by %d%n The answer is %d%n", m, n, m/n);
        }   
    }
}
