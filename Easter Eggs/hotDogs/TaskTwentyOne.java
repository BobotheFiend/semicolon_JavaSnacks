import java.util.Scanner;

public class TaskTwentyOne{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter for a: ");
        int a = inputNum.nextInt();        
        System.out.print("Enter for b: ");
        int b = inputNum.nextInt();
        System.out.print("Enter for c: ");
        int c = inputNum.nextInt();

        double bac = (b*b)-4*a*c;
        double bacSquPlus = -b + Math.sqrt(bac)/(2*a);
        double bacSquMinus = -b - Math.sqrt(bac)/2*a;

        if (bac > 0.0){
        System.out.printf("the root = %2.f and %2.f %n", bacSquPlus, bacSquMinus);
        }       
        else if (bac == 0.0){
        System.out.printf("the root = %2.f %n", bacSquPlus);
        } else if (bac != 0.0){
           System.out.printf("No Real Root");
          }
    }
}
