import java.util.Scanner;

public class TaskTwelve{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter the Vm/s : ");
        int velocity = inputNum.nextInt();

        System.out.print("Enter the a m/s : ");
        int acceleration = inputNum.nextInt();
        
        float velocitySq = velocity*velocity;

        double length = velocitySq/2*acceleration;

        System.out.printf("%s %.1f%n", "length =", length);
        

    }
}
