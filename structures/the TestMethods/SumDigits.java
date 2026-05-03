public class SumDigits{
  
    public static int sumOfDigit(int number){
        
        int count = number;
        int sum = 0;
        while(number > 0){
            int extractedDigit = number % 10;
            sum += extractedDigit;
            number/=10;
        }         
        return sum;
    }
}
