
public class ReverseIsAPalindrome{
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        reverse(number);
        palindrome(number);
    }

    public static int reverse(int number){
        int storeDigit = 0;
        int extractedDigit = 0;
        System.out.printf("%n%d reversed ----> ", number);
        while(number > 0){
            extractedDigit = number % 10;
            storeDigit = storeDigit * 10 + extractedDigit;
            number/=10;
            //System.out.printf("%d", extractedDigit);
        }
            System.out.printf("%d%n",storeDigit);
        return storeDigit;
    }

    public static boolean palindrome(int number){
        if (number == reverse(number)){
        System.out.printf("%d is a Palindrome%n", number);
        return true;
        }
          else{
            System.out.printf("%d is NOT! a Palindrome%n", number);
            return false;
        }

    }
}
