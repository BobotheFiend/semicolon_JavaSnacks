import java.util.Scanner;
public class FactorsofANumber{
    public static void main(String[] args){
        Scanner inputNumbers = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numbers = inputNumbers.nextInt();
        int count = 1;
        //int factors = 1;
     
        for (;count <= numbers; count++){
          if (numbers % count == 0)
            System.out.printf("%s%d%s%d%n","The Factors of ", numbers, " are: ", count );
        }
    }
}
