
public class DecreasingOrder{
    public static void main(String[] args){
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        double numberOne = input.nextDouble();
        System.out.print("Enter a number to reverse: ");
        double numberTwo = input.nextDouble();
        System.out.print("Enter a number to reverse: ");
        double numberThree = input.nextDouble();
        System.out.printf("%n");
        displaySortedNumbers(numberOne, numberTwo, numberThree);

    }

    public static void displaySortedNumbers(double numberOne, double numberTwo, double numberThree){
        

        //double countMax = Integer.MAX_VALUE;
        double count = numberOne;
        //for(;count > 0; count--){
         // System.out.println(count);
        //}
 
        double countTwo = numberTwo;
        //for(;countTwo > 0; countTwo--){
          //System.out.println(countTwo);
        //}

        double countThree = numberThree;

        System.out.printf("%7s\t %7s\t %7s\t%n","FIrst Number", "Second Number", "Third Number");
        for(;count > 0 || countTwo > 0 || countThree > 0; count--, countTwo--, countThree--){
        
            //if (count == 1 ||countTwo == 1 || countThree != 1) continue;
            //double firstNumber = Math.max(1, count); 
            //double secondNumber = Math.max(1, countTwo); 
            //double thirdNumber = Math.max(1, countThree);
          System.out.printf("%7.0f\t %14.0f\t %14.0f\t%n",count ,countTwo ,countThree);
            
        }
    }

}
