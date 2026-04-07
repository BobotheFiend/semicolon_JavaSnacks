import java.util.Scanner;

public class GradeGpa{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Grade: ");
        String grade = input.nextLine();

        if (grade.equals("A") ){
        System.out.printf("%s is a 4.0 GPA", grade);
        }   
        if (grade.equals("B")){
        System.out.printf("%s is a 3.0 GPA", grade);
        } 
        if (grade.equals("C")){
        System.out.printf("%s is a 2.0 GPA", grade);
        } 
        if (grade.equals("D")){
        System.out.printf("%s is a 1.0 GPA", grade);
        } 
        else if (grade.equals("F")){
        System.out.printf("%s is a 0.0 GPA", grade);
        } 
    }
}
