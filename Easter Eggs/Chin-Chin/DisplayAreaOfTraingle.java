import java.util.Scanner;

public class DisplayAreaOfTraingle{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base b: ");
        int b = input.nextInt();

        System.out.print("Enter height h: ");
        int h = input.nextInt();
       
        
        System.out.printf("The area of the triangle = %.1f%n", 0.5*b*h);
        
    }
}
