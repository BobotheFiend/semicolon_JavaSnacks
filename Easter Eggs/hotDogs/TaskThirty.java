import java.util.Scanner;

public class TaskThirty{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter the number of Seconds: ");
        int seconds = inputNum.nextInt();

        int hours = seconds/3600;

        int minutes= hours%60;

        int remaninder = seconds%60;

        System.out.printf("%d%s %d%s %d%s%n", hours, "hour(s)", minutes, "minutes", remaninder, "seconds");
        

    }
}
