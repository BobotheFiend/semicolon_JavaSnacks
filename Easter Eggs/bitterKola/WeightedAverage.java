import java.util.Scanner;

public class WeightedAverage{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int score1 = 40;
        int score2 = 35;
        int score3 = 25;

        double addBase = score1+score2+score3;
        double addNumerator = (0.40*40)+(0.35*35)+(0.25*25);
        double weightedAvg = addNumerator/addBase;

        System.out.printf("%.4f is the Weighted Average%n", weightedAvg);
        
    }
}
