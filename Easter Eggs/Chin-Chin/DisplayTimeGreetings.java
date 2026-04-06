import java.util.Scanner;

public class DisplayTimeGreetings{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number from 0-24 to display time of the day: ");
        int dayTime = input.nextInt();

        if (dayTime >= 5 && dayTime <= 11 ){
        System.out.printf("The time is: %d%s %s%n", dayTime, "am", "GOOD MORNING!");
        } 
        if (dayTime >= 12 && dayTime <= 17){
        System.out.printf("The time is: %d%s %s%n", dayTime, "pm", "GOOD AFTERNOON!");
        }
        if (dayTime >= 18 && dayTime <= 21){
        System.out.printf("The time is: %d%s %s%n", dayTime, "pm", "GOOD EVENING!");
        }
        if (dayTime >= 22 && dayTime <= 4){
        System.out.printf("The time is: %d%s %s%n", dayTime, "pm", "GOOD NIGHT!");
        }   else if (dayTime > 24){
            System.out.printf("Incorrect time entry!%n");
            }
    }
}
