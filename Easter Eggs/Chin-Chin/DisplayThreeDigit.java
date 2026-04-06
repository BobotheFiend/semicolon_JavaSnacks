import java.util.Scanner;

public class DisplayThreeDigit{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        if (num >= 100 && num <=999){
        System.out.printf("%d is a Three digit integer%n", num);
        } else {
        System.out.printf("%d is not a Three digit integer%n", num);
        }
    }
}
