import java.util.Scanner;

public class TaskThirty{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount of days: ");
        int days = input.nextInt();

        int monday = 0;
        int tuesday = 1;
        int wednesday = 2;
        int thursday = 3;
        int friday = 4;
        int saturday = 5;
        int sunday = 6;
        int calender = days / 7;

        if (calender == 0){
        System.out.printf("Today is monday");        
        }
        else if (calender == 1){
        System.out.printf("Tuesday");
        }   
        else if (calender == 2){
        System.out.printf("Wednesday");        
        }
        else if (calender == 3){
        System.out.printf("Thursday");
        }   
        else if (calender == 4){
        System.out.printf("Friday");        
        }
        else if (calender == 5){
        System.out.printf("Saturday");
        }
        else if (calender == 6){
        System.out.printf("Sunday");        
        }   
 
    }

}
