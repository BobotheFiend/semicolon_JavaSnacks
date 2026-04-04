import java.util.Scanner;

public class TaskTwenty{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int l = inputNum.nextInt();

        System.out.print
("Enter Breath: ");
        int b = inputNum.nextInt();

        int area = l*b;
        System.out.printf("%s %d%n", " The area = ", area);

    }

}
