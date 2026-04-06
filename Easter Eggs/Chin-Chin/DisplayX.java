import java.util.Scanner;

public class DisplayX{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        int a = input.nextInt();

        System.out.print("Enter coefficient b: ");
        int b = input.nextInt();

        System.out.print("Enter coefficient c: ");
        int c = input.nextInt();
        
        double cbMinus = c-b;
        double x = cbMinus/a;
        
        if (a == 0){
        System.out.printf("The equation has no unique solution!%n");
        }
        else {
        System.out.printf(" x = %.0f%n", x);
        }   
    }
}
