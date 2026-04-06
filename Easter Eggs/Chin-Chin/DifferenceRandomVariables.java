import java.util.Random;

public class DifferenceRandomVariables{

    public static void main(String[] args){

        Random number= new Random();

        int num1 = number.nextInt(10) +1;
        int num2= number.nextInt(10) +1;
        
        System.out.printf("%d - %d = %d%n", num1, num2, Math.abs(num1-num2));


    }
}
