import java.util.Scanner;

public class TaskTwo{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int num = inputNum.nextInt();

        int lengthSq = num*num;

        double area = (Math.sqrt(3)/4)*lengthSq;

        System.out.printf("%s %.3f%n", "The area of the Triangle =", area);
        

    }
}
