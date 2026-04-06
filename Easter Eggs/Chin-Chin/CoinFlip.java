import java.util.Scanner;
import java.util.Random;

public class CoinFlip{

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        Random flip = new Random();

        boolean coin = flip.nextBoolean();
        
        System.out.print(" guess if its 0 or 1 = ");
        int guess = input.nextInt();

        boolean zero = true;
        boolean one = false;

        if (zero == coin){
        System.out.printf("You guessed correctly%n");
        } else if (zero != coin){
          System.out.printf("No luck!");
          }
        else if (one == coin){
        System.out.printf("You guessed corretly%n");
        }   else if (one != coin){
            System.out.print("Noluck");
            }
    }
}
