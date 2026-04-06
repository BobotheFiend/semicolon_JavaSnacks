import java.util.Scanner;

public class Hypotenuse{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length a: ");
        int a = input.nextInt();

        System.out.print("Enter length b: ");
        int b = input.nextInt();
        
        double aSq = Math.pow(a,2);
        double bSq = Math.pow(b,2);
        double abPlus = aSq + bSq;
        double h = Math.sqrt(abPlus);
        
        System.out.printf("The Hypotenus = %.1f%n", h);
        
    }
}
