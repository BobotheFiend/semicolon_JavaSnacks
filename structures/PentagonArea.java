public class PentagonArea{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
    
        System.out.print("Enter the side length of the pentagon: ");
        double userInput = input.nextDouble();
        System.out.printf("%.2f",area(userInput));
    }
  
    public static double area(double side){
        
        double areaOfPentagon = (5 * Math.pow(side,2)) / (4 * Math.tan(3.14/5));
    return areaOfPentagon;
    }
}
