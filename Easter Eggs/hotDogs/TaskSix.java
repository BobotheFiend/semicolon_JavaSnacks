import java.util.Scanner;

public class TaskSix{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        double subTotal = 10;
        double gratuityRate = 0.12;

        double gratuity = gratuityRate*subTotal;

        System.out.printf("%s %.3f and %s %.3f%n", "gratuity =", gratuity, "Total =", subTotal+gratuity);
        

    }
}
