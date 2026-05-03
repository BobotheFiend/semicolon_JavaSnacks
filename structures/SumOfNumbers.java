public class SumOfNumbers{
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        
        sumDigits(number);

    }

    public static int sumDigits(long n){

        int count;
        int sum = 0;
        for(count = 1; count <= n; count++){
          sum += count;    
            System.out.printf("%7d%n", sum);
        }
            System.out.printf("The sum of the all numbers in %d = %d%n",n,sum);
        return sum;
    }

    
}
