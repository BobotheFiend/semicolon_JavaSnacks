import java.util.Scanner;

public class FizzBuzz{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        if (num % 5 == 0 || num % 5 == 5 ){
        System.out.printf("BUZZ!%n");
        } 
        if (num % 3 == 0){
        System.out.printf("FIZZ!%n");
        }
        if (num % 5 == 0 || num % 5 == 5 && num % 3 == 0){
        System.out.printf("FizzBuzz!%n");
        }   else if (num % 5 != 0 && num % 5 != 0 && num % 3 != 0){
            System.out.printf("%d%n", num);
            }
    }
}
