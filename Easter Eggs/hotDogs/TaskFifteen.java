import java.util.Scanner;

public class TaskFifteen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter your x1: ");
        int x1 = inputNum.nextInt();        
        System.out.print("Enter your x2: ");
        int x2 = inputNum.nextInt();
        System.out.print("Enter your y1: ");
        int y1 = inputNum.nextInt(); 
        System.out.print("Enter your y2: ");
        int y2 = inputNum.nextInt();

        int xOne = x2-x1;
        int yOne = y2-y1;
        int xSq = xOne*xOne;
        int ySq = yOne*yOne;
        int addBoth = xSq+ySq;
        double squareAnswer = Math.sqrt(addBoth);

        System.out.printf("The distance between them = %.2f%n", squareAnswer);
    }
}
