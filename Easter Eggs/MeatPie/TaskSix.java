import java.util.Scanner;

public class TaskSix{

    public static void main(String[] args){

        Scanner inputCount = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int counter = inputCount.nextInt();

        int increase = counter++;
        System.out.printf("%s = %d%n", "increased by one", increase);
        int  increase2 = counter++;
        System.out.printf("%s = %d%n", "increased by one", increase2);
        int increase3 = counter++;
        System.out.printf("%s = %d%n", "increased by one ", increase3);

    }

}
