public class WelcomeBackPrime{
    public static void main(String[] args){
    java.util.Scanner input = new java.util.Scanner(System.in);
   
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    System.out.print("Prime factors of " + number + " are: ");
    boolean prime = primeNumbers(number);
    System.out.printf("is %d a prime number? %b",number,prime);
}

    public static boolean primeNumbers(int numbers){

        for (int count = 2; count<= numbers/2; count++) {
            if (numbers % count == 0) {
               return false;
            }
        }
        return true;
          
    }

}
