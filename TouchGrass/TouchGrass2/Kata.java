public class Kata{
    public static void main(String[] args){
    
    maximum (419, 234);
    boolean evenNumbers = isEven (234);
    subtract (333, 999);
    divide (22,2);
    isPalindrome (50105);
    squareOf (12);
    factorialOf (9);
    isPerfectSquare (25);
    factorOf(12);
    boolean prime = isPrimeNumber(25);
    }


    public static int maximum(int firstNumber, int secondNumber){
        int maxNumber = firstNumber;
        if (secondNumber > maxNumber){
            maxNumber = secondNumber;
            }
        System.out.printf("%s%d%n", "The Maximum number = ", maxNumber);
        return maxNumber;
     }
    public static boolean isEven(int number){
        if (number % 2 == 0){
            System.out.printf("%s%d%s%n", "The integer ", number, " is Even");
            return true;
        }
        else{
            System.out.printf("%s%d%s%n", "The integer ", number, " is Odd");
            return false;
        }
     }   
    public static int subtract(int firstNumber, int secondNumber){
        int minus = Math.abs(firstNumber - secondNumber);
        System.out.printf("%s%d%n", "The difference = ", minus);
            return minus;
     }   
    public static float divide(int firstNumber, int secondNumber){
        
        if (secondNumber == 0){
            return 0;
          }
        else {
            int divison = firstNumber / secondNumber;
            System.out.printf("%s%d%n", "The quotient = ", divison);
            return divison;
        
        }
     }
    public static boolean isPalindrome(int number){
        int digitOne = number/10;
        int digitRemainderOne = number % 10;

        int digitTwo = digitOne/10;
        int digitRemainderTwo = digitOne % 10;
    
        int digitThree = digitTwo/10;
        int digitRemainderThree = digitTwo % 10;

        int digitFour = digitThree/10;
        int digitRemainderFour = digitThree % 10;

        int digitFive = digitFour/10;
        int digitRemainderFive = digitFour % 10;
        
        if (digitRemainderOne == digitRemainderFive && digitRemainderTwo == digitRemainderFour){
        System.out.printf("%d ---> %d%d%d%d%d, the number is a Palindrome%n", number, digitRemainderOne,digitRemainderTwo,digitRemainderThree,digitRemainderFour,digitRemainderFive);
        return true;
            }   
        else {
        System.out.printf("%d ---> %d%d%d%d%d, the number is not a Palindrome%n", number, digitRemainderOne,digitRemainderTwo,digitRemainderThree,digitRemainderFour,digitRemainderFive);
         return false;
            }        
     }   
    public static long squareOf(int number){
        long square = number*number;
        System.out.printf("The Suare of %d = %d%n", number, square); 
            return square;
     }
    public static long factorialOf(int numbers){
         int scores = numbers;  
         int factorial = 1;
         for(; scores > 0;scores--){
            factorial *= scores;
               System.out.printf("%d%s",scores, " x ");
                System.out.printf("%d%n", factorial);     
            }
            return factorial;  
    }
    public static boolean isPerfectSquare(int number){ 
        
        double square = (int)Math.sqrt(number);

        if (square*square == number){
            System.out.printf("%d%s%n",number, " is a perfect square");
            return true;
            }
        else {
            System.out.printf("%d%s%n", number, " is not a perfect square");
            return false;
        }
     }
    public static int factorOf (int numbers){
        int factors = numbers;
        int count = 1;
     
        for (;count <= numbers; count++){
          if (numbers % count == 0)
            System.out.printf("%s%d%s%d%n","The Factors of ", numbers, " are: ", count );
        
            }
          return count;
     }
    public static boolean isPrimeNumber(int number){
     
     int count = 1;
     int factors = 0;
    for(;count <= number; count++){
     if (number % count == 0){
        factors++;
       }
    }
     if (factors > 2){
    return false;
    }

     else if (factors == 2){
    
        }
        return true;
    }
}

