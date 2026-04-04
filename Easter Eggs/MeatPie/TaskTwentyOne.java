import java.util.Scanner;

public class TaskTwentyOne{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.println("Enter Base: ");
        int b = inputNum.nextInt();

        System.out.println("Enter Height: ");
        int h = inputNum.nextInt();

        double areaTriangle= b*h/2;
        System.out.printf("%s %d%n", " The area of the triangle = ", areaTriangle);

    }

}
