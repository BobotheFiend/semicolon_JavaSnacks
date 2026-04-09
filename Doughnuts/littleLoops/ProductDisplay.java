import java.util.Scanner;
public class ProductDisplay{
    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);

        int i = 1;
        int j = 2;
        while (i <= 10){
        System.out.printf("%d %n", i*j);
       i++;
        j++;
       
        }
    }
}
