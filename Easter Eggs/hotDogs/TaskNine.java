import java.util.Scanner;

public class TaskNine{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter the initial velocity : ");
        float velocity = inputNum.nextFloat();


        System.out.print("Enter the time : ");
        float time = inputNum.nextFloat();

        System.out.print("Enter the acceleration : ");
        float acceleration = inputNum.nextFloat();
        
        float ut = velocity*time;

        float timeSq = time*time;

        double at = 0.5*acceleration*timeSq;

        double s = ut+at;

        System.out.printf("%s %.2f%n", "The distance covered d =", s);
        

    }
}
