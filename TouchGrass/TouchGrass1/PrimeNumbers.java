import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] args){
        Scanner inputNumbers = new Scanner(System.in);

        int count = 0;
        int numbers = 2;
     
        for (;numbers <= 1200; numbers++){

        if (numbers % 2 != 0 && numbers % 3 != 0)
            System.out.printf("%s%n%d%n","The prime numbers from 2 - 1200 are: ", numbers);
        }
    }
}
