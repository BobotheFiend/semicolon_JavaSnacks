import java.util.Scanner;

public class TaskSixteen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter the side of the hexagon: ");
        int side = inputNum.nextInt();        
        
        double sideSq = side*side;
        double root = Math.sqrt(3)/2;
        double area = 3*root*sideSq;

        System.out.printf("The area of the hexagon is = %.1f%n", area);
    }
}
