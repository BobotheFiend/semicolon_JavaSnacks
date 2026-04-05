import java.util.Scanner;

public class TaskFourteen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter your weight in lbs: ");
        int lbs = inputNum.nextInt();        

        System.out.print("Enter your height in inches: ");
        int inches = inputNum.nextInt();

        double kg = 0.45359237*lbs;
        double meters = 0.0254*inches;
        double bmi = kg/meters*meters;

        if (bmi< 18.5){
        System.out.printf("Your BMI = %.1f%n%s%n", bmi, "You are UnderWeight!");
        }
        else if (bmi == 18.5%24.9){
        System.out.printf("Your BMI = %.1f%n%s%n", bmi, "You are Healthy!");
        }
        if (bmi >= 25.0%29.9){
        System.out.printf("Your BMI = %.1f%n%s%n", bmi, "You are OverWeight!");
        }
        if (bmi > 30.0){
        System.out.printf("Your BMI = %.1f%n%s%n", bmi, "You are Obessed!");
        }
    }
}
