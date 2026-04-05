import java.util.Scanner;

public class TaskThree{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int num = inputNum.nextInt();

        int lengthSq = num*num;

        double area = (Math.sqrt(3)/4)*lengthSq;
    
        System.out.print("Enter height: ");
        int lenght = inputNum.nextInt();

        double volume = area*length;

        System.out.printf("%s %.3f%n", "The volume of the Triangle =", volume);
        

    }
}
