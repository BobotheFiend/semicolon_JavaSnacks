import java.util.Scanner;

public class DescendingOrder{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num1 = input.nextInt();

        System.out.print("Enter number: ");
        int num2 = input.nextInt();

        System.out.print("Enter number: ");
        int num3 = input.nextInt();

        int smallest = Math.min(num1,Math.min(num2,num3));
        int largest = Math.max(num1,Math.max(num2,num3));
        int mid = largest-smallest;
        System.out.printf("%d,%d,%d%n", smallest, mid, largest);
        
    }
}
