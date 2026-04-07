import java.util.Scanner;

public class BmiDisplay{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight kg: ");
        int weight = input.nextInt();

        System.out.print("Enter height meters: ");
        double height = input.nextDouble();

        double mSq = height*height;
        double bmi = weight/mSq;

        if (bmi < 18.5 ){
        System.out.printf("Your BMI = %.1f%nYou're Underweight%n", bmi);
        } 
        if (bmi >= 18.5 && bmi < 29){
        System.out.printf("Your BMI = %.1f%nYou're Normalweight%n", bmi);
        }
        if (bmi >= 29 && bmi < 30){
        System.out.printf("Your BMI = %.1f%nYou're Overweight%n", bmi);
        }
        if (bmi >= 30){
        System.out.printf("Your BMI = %.1f%nYou're OBESE!%n", bmi);
        }
    }
}
