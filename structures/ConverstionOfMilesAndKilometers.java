public class ConverstionOfMilesAndKilometers{
    public static void main(String[] args){
         double number = 2;   

        System.out.printf("Converting %.2f to km = %.2f%n",number,mileToKilometer(number));
        System.out.printf("Converting %.2f to m = %.2f%n",number, kilometerToMile(number));

        System.out.printf("%n miles to Kilometers \t Kilometers to Miles%n");
        double count = 1;
        for (;count <= 10; count++){
            
            System.out.printf("  %.0fm makes %.2fkm \t   %.0fkm makes %.2fm%n",count, mileToKilometer(count),count, kilometerToMile(count));
            }
    }

    public static double mileToKilometer(double mile){

       double converterToKm = mile * 1.60934 ;
        return converterToKm;
    }

    public static double kilometerToMile(double kilometer){
        double converterToMiles = kilometer * 0.621371;
        return converterToMiles;
    }
}

