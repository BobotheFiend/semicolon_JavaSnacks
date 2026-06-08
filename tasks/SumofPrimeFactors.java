import java.util.Scanner;
public class SumofPrimeFactors{
    public static void main(String[] args){




        int number = 1;
        for (; number <= 100 ; number++){
            
            boolean isItPrime = true;
            if (number < 2)
                isItPrime = false;

            int count = 2;
            for(; count <= number/2; count++ ){

                if(number % count == 0){
                    isItPrime = false;
                }
            }

            if (isItPrime == true){
                System.out.printf("%d Is Prime%n", number);        
            }
            else{
                System.out.printf("%d is not Prime%n", number);    
            }
        }

    }
}  
