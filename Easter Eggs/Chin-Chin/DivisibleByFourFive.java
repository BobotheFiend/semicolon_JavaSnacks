import java.util.Scanner;

public class DivisibleByFourFive{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = inputNum.nextInt();

        if (num % 4 == 0 && num % 5 == 0){
        System.out.printf(" %d is divisible by both 4 and 5 %n", num);
        }  if (num % 4 == 0 || num % 5 == 0){
            System.out.printf(" %d is divisible either by 4 or 5 %n", num);
            }  if (num % 4 == 0 ){
                System.out.printf(" %d is divisible by 4 and not 5 %n", num);
                }   else if (num % 5 == 0){
                    System.out.printf(" %d is divisible by 5 not 4 %n", num);
                    }   else if (num % 5 != 0 && num % 4 != 0){
                    System.out.printf(" %d is not divisible by 5 and or 4 %n", num);
                    }

    }
}
