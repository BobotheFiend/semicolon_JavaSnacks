public class PolygonArea{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
    
        System.out.print("Enter the number of sides on the Polygon: ");
        int number = input.nextInt();
        System.out.print("Enter the side length of the Polygon: ");
        double side = input.nextDouble();
        System.out.printf("%.2f",area(number,side));
    }
  
    public static double area(int number, double side){
        
        double area = (number * Math.pow(side,2)) / (4 * Math.tan(3.14/number));
    return area;
    }
}
