import java.util.Scanner;

public class MultipleOfFive{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int value = input.nextInt();

        if (value % 5 == 0 && value % 5 == 0){
        System.out.printf(" HiFive%n");
        }
        if (value % 2 == 0){
        System.out.printf(" HiEven%n");
        } else {
            System.out.print("Not Valid");
            }


    }
}
