import java.util.Scanner;
public class InputNumbersDisplay{
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Enter any number of your choice: ");
        int number = inputNumber.nextInt();
        int i = 1;
        while (i <= number){
        System.out.printf("%d <= %d %n", number, i);
       i++;
        }
    }
}
