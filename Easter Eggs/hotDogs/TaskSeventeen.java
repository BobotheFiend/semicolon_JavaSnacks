import java.util.Scanner;

public class TaskSeventeen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter your x1: ");
        int x1 = inputNum.nextInt();        
        System.out.print("Enter your x2: ");
        int x2 = inputNum.nextInt();
        System.out.print("Enter your x3: ");
        int x3 = inputNum.nextInt(); 
        System.out.print("Enter your y1: ");
        int y1 = inputNum.nextInt();
        System.out.print("Enter your y2: ");
        int y2 = inputNum.nextInt(); 
        System.out.print("Enter your y3: ");
        int y3 = inputNum.nextInt();

        int sideOne = x1*y1;
        int sideTwo = x2*y2;
        int sideThree = x3*y3;
        int s = (sideOne+sideTwo+sideThree)/2;
        int bracketOne = s-sideOne;
        int bracketTwo = s-sideTwo;
        int bracketThree = s-sideThree;
        int bracket = bracketOne*bracketTwo*bracketThree;
        int sBracket = s*bracket;
        double area = Math.sqrt(sBracket);

        System.out.printf("The area = %f%n", area);
    }
}
