import java.util.Scanner;

public class ConversionBytes{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter byte: ");
        double num = input.nextDouble();

        double kb = num*0.001;
        double mb = num*0.000001;
        double gb = num*0.000000001;

        System.out.printf("from %.1fbytes to %.1fkb%nfrom %.1fbytes to  %.1fmb%nFrom %.1fbytes to %.1fgb%n", num, kb, num, mb, num, gb);
        
    }
}
