import java.util.Scanner;
public class ProductDisplay{
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);
        
        int result = 1;
        int i = 1;
        while (i <= 10){
        result = result * i;
        System.out.printf("%d = %d%n", i, result);
       i++;}
    }
}
