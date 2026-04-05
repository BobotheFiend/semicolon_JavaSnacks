import java.util.Scanner;

public class TaskTwentyFive{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter weight of first rice: ");
        double weight1 = inputNum.nextDouble();        
        System.out.print("Enter price of the first rice: ");
        double price1 = inputNum.nextDouble();
        
        System.out.print("Enter weight of second rice: ");
        double weight2 = inputNum.nextDouble();    
        System.out.print("Enter price of second rice: ");
        double price2 = inputNum.nextDouble();

        double riceOne = price1/weight1;
        double riceTwo = price2/weight2;

        if (riceOne > riceTwo){ 
        System.out.printf("the first bag %.1f has the better price per unit weight%n", riceOne);
        }
        else if (riceTwo > riceOne){   
        System.out.printf("the second bag %.1f has the better price per unit weight%n", riceTwo);
        }
        else if (riceOne==riceTwo){
        System.out.printf("both bags %.1f and %.1f are equal%n",riceOne, riceTwo);
        }
    }
}
