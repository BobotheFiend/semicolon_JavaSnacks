import java.util.Scanner;
public class DecendingNumbersDisplay{
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Enter any number of your choice: ");
        int number = inputNumber.nextInt();
        for (;number >= 1; number--){
        System.out.printf("%d %n", number);
        }
    }
}
