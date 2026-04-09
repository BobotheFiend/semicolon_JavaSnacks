import java.util.Scanner;
public class SumOfNumbersDisplay{
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Enter any number of your choice: ");
        int numberInput = inputNumber.nextInt();
        int i = 1;
        int add = 0;
        for (;i <= numberInput; i++){
       add = (numberInput * (numberInput+1))/2;
        
        }
        System.out.printf("%d%n",add);     
    }
}
