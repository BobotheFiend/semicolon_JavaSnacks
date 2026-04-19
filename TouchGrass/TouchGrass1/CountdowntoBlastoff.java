import java.util.Scanner;
public class CountdowntoBlastoff{
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt(); 

        for(; number > 0; number--){ 
               System.out.printf("%d%n",number);
        }
        System.out.printf("%s%n", "B L A S T   O F F!!!");
    }
}
