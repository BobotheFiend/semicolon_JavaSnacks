import java.util.Scanner;

public class Pattern{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of rows ");
    int row = input.nextInt();
    int count = 1;
    for(; count <= row; count++){
         for(int space = count; space < row ; space++){
            System.out.print(" ");
            }
         for(int coloums = 1; coloums <= count; coloums++){
            System.out.printf("*");
        }
        System.out.printf("%n");
        }
    }
}

