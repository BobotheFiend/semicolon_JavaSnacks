import java.util.Scanner;

public class TaskEight{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter the number of Minutes: ");
        int minute = inputNum.nextInt();

        int hours = minute/60;

        int days = hours/24;

        int years = days/365;

        int remaninder = days%365;

        System.out.printf("%s %d%s and %s %d%s%n", "Maximum number of", years, "Year(s)", "remaining", remaninder, "days");
        

    }
}
