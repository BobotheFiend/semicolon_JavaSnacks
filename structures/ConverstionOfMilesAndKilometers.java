public class ConverstionOfMilesAndKilometers{
    public static void main(String[] args){
         double number = 2;   
        System.out.printf("Converting %.2f to km = %.2f%n",number,mileToKilometer(number));
        System.out.printf("Converting %.2f to m = %.2f%n",number, kilometerToMile(number));
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

