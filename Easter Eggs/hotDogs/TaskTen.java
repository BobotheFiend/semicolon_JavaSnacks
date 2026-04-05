import java.util.Scanner;

public class TaskTen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter the amount of water : ");
        int waterKg = inputNum.nextInt();

        System.out.print("Enter the  initial Temperature : ");
        float initialTemp = inputNum.nextFloat();

        System.out.print("Enter the final Temperature : ");
        float finalTemp = inputNum.nextFloat();
        
        float bracket = finalTemp-initialTemp;

        double q = waterKg*bracket*4184;

        System.out.printf("%s %.3f%n", "Q =", q);
        

    }
}
