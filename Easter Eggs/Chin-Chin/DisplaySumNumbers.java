import java.util.Scanner;

public class DisplaySumNumbers{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = input.nextInt();
        
        double nSq = n*n + n*1;
        double sNum = nSq/2;
        
        System.out.printf("The num = %.0f%n", sNum);
        
    }
}
