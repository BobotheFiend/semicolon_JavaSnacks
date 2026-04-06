import java.util.Scanner;

public class DisplayPerimeter{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length = ");
        int length = input.nextInt();

        System.out.print("Enter the Breath = ");
        int breath = input.nextInt();

        if (length != breath){
        System.out.printf("if length = %d and breath = %d%nThe perimeter is valid!%n", length, breath);
        }   else {
            System.out.printf("The input is invalid%n");
            }
    }
}
