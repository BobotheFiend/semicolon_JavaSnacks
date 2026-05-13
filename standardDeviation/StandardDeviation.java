public class StandardDeviation{

    

    public static double mean(double[] collections){
        double average = 0;
        double total = 0;
        int count = 0;
        for(;count < collections.length;count++){

            total += collections[count];
        }

        average = total/collections.length ;
        return average;
    }

    public static double variance(double [] collections){

        double [] meanSubtractionsSquare = new double [collections.length];
        double mean = mean(collections);
        double total = 0;
        double subtraction = 0;
        int count = 0;
        for(;count < collections.length;count++){

             total = collections[count];
             subtraction = total - mean(collections);
             meanSubtractionsSquare[count] = subtraction*subtraction;
         }

//        return java.util.Arrays.toString(meanSubtractions);
        
        double addition = 0;
        int counter = 0;
        for(; counter < meanSubtractionsSquare.length;){
           addition += meanSubtractionsSquare[counter++]; 
        }
        
        double varianceCalculator = addition/meanSubtractionsSquare.length;

        return varianceCalculator;
    }

    public static double standardDeviation(double [] collections){  
        double varianceNumber = variance(collections);
        double resultSD = Math.sqrt(varianceNumber);
        double twoDecimal = Math.round(resultSD * 10.0)/10.0;
        return twoDecimal;
    }
}
