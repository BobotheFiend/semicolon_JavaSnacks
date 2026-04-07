import java.util.Scanner;

public class PositiveInteger{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();
        //The numerator computes all numbers given to it into an even number which in turn is always divisible by 2
        int positive = (num*(num+1))/2;

        System.out.printf("%d%n", positive);
        
    }
}
