import java.util.Scanner;

public class TaskFour{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter the meter: ");
        double numMeter = inputNum.nextDouble();

        double feet = 3.2786*numMeter;

        System.out.printf("%.2f%s is %.4f%s%n", numMeter, "m", feet, "ft");
        

    }
}
