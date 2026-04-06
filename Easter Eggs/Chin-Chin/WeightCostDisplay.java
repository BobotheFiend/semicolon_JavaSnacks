import java.util.Scanner;

public class WeightCostDisplay{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        int num = inputNum.nextInt();

        if (num > 0 && num <= 2 ){
        System.out.printf(" The package weighs %d%s and it costs $2.5 to ship%n", num,"kg");
        }

        else if (num > 2 && num <= 4 ){
        System.out.printf(" The package weighs %d%s and it costs $4.5 to ship%n", num,"kg");
        }

        else if (num > 4 && num <= 10 ){
        System.out.printf(" The package weighs %d%s and it costs $7.5 to ship%n", num,"kg");
        }

        else if (num > 10 && num <= 20 ){
        System.out.printf(" The package weighs %d%s and it costs $10.5 to ship%n", num,"kg");
        }

        else if (num > 20){
        System.out.printf(" The package weighs %d%s%n The pacakge cannot be shipped!", num,"kg");
        }
    }
}
