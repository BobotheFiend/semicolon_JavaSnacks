import java.util.Scanner;

public class PatternLoops{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of rows ");
    int row = input.nextInt();
    int count = 1;
    for(; count <= row; count++){
        for(int coloums = row; coloums >= 1 ; coloums--){
            if (count >= coloums){
            System.out.printf("*");
            }
        else {
                System.out.print(" ");
        }
            
        }
        System.out.printf("%n");
        }
    }
}

