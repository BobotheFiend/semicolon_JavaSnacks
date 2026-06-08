import java.util.Scanner;
public class GasMileage{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        
        int total = 0;
        double average = 0;
        
        System.out.print("Ener the miles covered for a trip: ");
        int miles = inputCollector.nextInt();
        System.out.print("Enter the amount of gallon consumed for a trip: ");
        int gallon = inputCollector.nextInt();
        int count = 0;
        while(miles != 0 && gallon != 0){
        double milesPerGallon = miles/gallon;
        System.out.printf("Your miles/gallon is %.2f%n", milesPerGallon);
        count++;
            System.out.println("Input 0 for both miles and gallons to stop");
            
            total += milesPerGallon;
            System.out.print("Ener the miles covered for a trip: ");
            miles = inputCollector.nextInt();
            System.out.print("Enter the amount of gallon consumed for a trip: ");
            gallon = inputCollector.nextInt();    
        }
        average = total/count;
        System.out.printf("Your average miles/gallon is %.02f%n", average);
        
    }
}
            
