public class PrimeNumbers{
  
    public static boolean isPrime(int number){
        int checker = 0;
        int count = 1;
        for(;count <= number/2; count++){
            if (number % count == 0){
              if (checker == 2)
            return true;
            }
        }         
        return false;
    }
}
