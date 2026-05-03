public class LargestOfThree{
  
    public static int max(int firstNumber, int secondNumber, int thirdNumber){
        int largest = firstNumber;
        if (secondNumber > largest){
            largest = secondNumber;
            }
        if (thirdNumber > largest){
            largest = thirdNumber;
        }   
               
    return largest;
    }
}
