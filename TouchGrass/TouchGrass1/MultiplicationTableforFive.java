//import java.util.Scanner;
public class MultiplicationTableforFive{
    public static void main(String[] args){

    //Scanner inputCollector = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        int scores = 5; 
        int multiply = 0;
        int count = 1;
        //int denominator = 0;
        //double average = 0;

        for(; count<= 12;count++){
            multiply = scores * count;
               System.out.printf("%d%s%d%s%d%n",scores, " x ", count, " = ", multiply);
        }
    
    }
}
