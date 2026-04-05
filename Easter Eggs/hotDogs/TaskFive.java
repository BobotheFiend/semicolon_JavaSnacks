import java.util.Scanner;

public class TaskFive{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter the Square Meter: ");
        double numSq = inputNum.nextDouble();

        double ping = 0.3025*numSq;

        System.out.printf("%.3f%s is %.3f%s%n", numSq, "Sq/m", ping, "ping");
        

    }
}
