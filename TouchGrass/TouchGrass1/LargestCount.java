import java.util.Scanner;
public class LargestCount{
    public static void main(String[] args){
    Scanner inputNumbers = new Scanner(System.in);

        int count = 0;
        int largest = 0;
        System.out.print("Enter a number: ");
        int numbers = inputNumbers.nextInt();
        for(;numbers != 0;){
            if (numbers > largest){
                largest = numbers;
                count++;
                }
            else if (numbers == largest){
                    count ++;
                }
        System.out.print("Enter a number: ");
        numbers = inputNumbers.nextInt();
        }
       System.out.printf("The largest number = %d%n%s%d%n ",largest,"The count of all intergers inputed = ",count);
 
    }
}
