import java.util.Scanner;

public class CylinderDiplaySurfaceArea{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int radius = input.nextInt();

        System.out.print("Enter a number: ");
        int height = input.nextInt();
        
        double pi = 3.142;
        int rSq = radius*radius;
        double left = 2*pi*radius*height;
        double right = 2*pi*rSq;
        double area = left+right;
        
        System.out.printf("The Surface Area = %.2f%n", area);
        
    }
}
