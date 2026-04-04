import java.util.Scanner;

public class TaskTwentyTwo{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        int r = inputNum.nextInt();

        int rSquare = r*r;
        float pi = 3.142f;

        float areaCircle = pi*rSquare;
        System.out.printf("%s %f%n", " The area of the circle = ", areaCircle);

    }

}
