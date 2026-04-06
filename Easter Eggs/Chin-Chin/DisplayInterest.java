import java.util.Scanner;

public class DisplayInterest{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle p: ");
        int p = input.nextInt();

        System.out.print("Enter rate r: ");
        int r = input.nextInt();

        System.out.print("Enter time t: ");
        int t = input.nextInt();
       
        int prt = p*r*t;
        int simpInterest = prt/100;

        double pDiv = 1+r*0.01;
        double pMulti = p*pDiv;
        double compInterest = Math.pow(pMulti,t);

        System.out.printf("The simple intrest = %d%nThe compound intrest = %.2f%n", simpInterest, compInterest);
        
    }
}
