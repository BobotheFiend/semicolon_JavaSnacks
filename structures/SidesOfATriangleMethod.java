
public class SidesOfATriangleMethod{
    public static void main(String[] args){

        area(12,13,14);
    }

    public static boolean isValid(double sideOne, double sideTwo, double sideThree){
        if(sideOne + sideTwo > sideThree || sideOne + sideThree > sideTwo || sideThree + sideTwo > sideOne){
            return true;
        }
        else{
         return false;
        }
    }

    public static double area(double sideOne, double sideTwo, double sideThree){
          isVaild(sideOne, sideTwo,sideThree);
            double semiPerimeter = (sideOne + sideTwo + sideThree)/2;
            double area = Math.sqrt(semiPerimeter*(semiPerimeter-sideOne)*(semiPerimeter-sideTwo)*(semiPerimeter-sideThree));
            System.out.printf("The area of the sides = %.2f%n", area);
      return area; 
    }
}
