import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor{

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        Random generate = new Random();

        int scissor = generate.nextInt(3);
        int rock = generate.nextInt(3);
        int paper = generate.nextInt(3);
        
        System.out.print("Enter either 0, 1, 2: ");
        int enter = input.nextInt();

        if (enter == scissor && enter == rock && enter == paper){
        System.out.printf(" A draw%n");
        } else if (enter < scissor && enter < paper && enter < rock){
            System.out.printf("Computer wins%n");
            } else if  (enter > scissor && enter > paper && enter > rock){
              System.out.printf(" User Wins%n");
              }
    }
}
