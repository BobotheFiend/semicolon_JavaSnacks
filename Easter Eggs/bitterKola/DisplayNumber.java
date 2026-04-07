import java.util.Scanner;

public class DisplayNumber{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        if (num >= 10 && num <= 100){
        System.out.printf("%d%n", num);
        } 
        else  {
        System.out.printf("not needed%n");
        } 
    }
}
