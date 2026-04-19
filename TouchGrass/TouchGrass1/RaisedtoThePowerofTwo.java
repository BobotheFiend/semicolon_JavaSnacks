import java.util.Scanner;
public class RaisedtoThePowerofTwo{
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int scores = inputCollector.nextInt(); 
        int power = 0;
        int count = 1;

        for(; count <= scores;count++){
            power = (int)Math.pow(2,count);
               System.out.printf("%d%s%d%s%d%n", 2, "^", count, " = ", power);
        }
    
    }
}
