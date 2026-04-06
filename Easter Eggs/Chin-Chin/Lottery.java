import java.util.Scanner;
import java.util.Random;

public class Lottery{

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        Random generate = new Random();

        int lottery = generate.nextInt(100);
        
        int splitLottery = lottery/10;
        int remLottery = lottery % 10;
        
        System.out.print("Enter a 2 digit number 00-99: ");
        int number = input.nextInt();
        
        int splitNumber = number/10;
        int remNumber = number % 10;

        if (number == lottery){
        System.out.printf("lottery is %02d and your guess is %02d%nCongratulations! You win $10,000%n", lottery, number);
        } else if (splitLottery == splitNumber||splitLottery == remNumber||remLottery == splitNumber|| remLottery == remNumber){
            System.out.printf(" lottery is %02d and your guess is %02d%nCongratulations! You win $1,000%n", lottery, number);
            } else if  (splitLottery == splitNumber && splitLottery == remNumber && remLottery == splitNumber && remLottery == remNumber){
              System.out.printf(" lottery is %02d and your guess is %02d%nCongratulations! You Win $3,000%n", lottery, number);
              } else if (number != lottery){
                System.out.printf(" lottery is %02d and your guess is %02d%%nBetter luck next time%n", lottery, number);
                }
    }
}
