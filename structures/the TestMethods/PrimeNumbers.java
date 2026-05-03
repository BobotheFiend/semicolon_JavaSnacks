public class PrimeNumbers{
  
    public static boolean isPrime(int number){
        
        int count = 2;
        for(;count <= number/2; count++){
            if (number % count == 0){
            return false;
            }
        }         
        return true;
    }
}
