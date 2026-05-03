
public class DisplayIntegerReverse{
    public static void main(String[] args){
    java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();
        
        reverse(userInput);

    }

    public static void reverse(int number){
        int storedDigit = 0;
        System.out.printf("The reverse of %d = ", number);
        int extractedDigit = 0;
        while(number > 0){
            extractedDigit = number % 10;
            storedDigit = storedDigit * 10 + extractedDigit;
            number/=10; 
        } 
        System.out.printf("%d%n", storedDigit);
    }

}
