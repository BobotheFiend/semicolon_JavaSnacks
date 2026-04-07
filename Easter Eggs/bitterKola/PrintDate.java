import java.util.Scanner;

public class PrintDate{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        int mins = input.nextInt();

        double day = mins/1440;
        double minRem = mins-(day*1440);
        double hours = minRem / 60;
        double finMins = minRem-(hours*60);

        System.out.printf("%.0f%s %.0f%s %.1f%s%n", day, "day(s)", hours, "hour(s)", finMins, "minutes");

    }
}
