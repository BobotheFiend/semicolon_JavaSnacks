import java.util.Scanner;

public class TaskEight{

    public static void main(String[] args){

        Scanner inputCube = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int cube = inputCube.nextInt();
 
        System.out.printf("%s %d%n", "The Cube of the number =", cube*cube*cube);

    }

}
