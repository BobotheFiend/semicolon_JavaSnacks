
public class FindingTheLargestNumber{
    public static void main(String[] args){

    //int numberOne = 88;
    //int numberTwo = 66;
    //int numberThree = 33;
 FindingTheLargestNumber large = new FindingTheLargestNumber();
    //int number = largest;
    int number = large.findLargest(5,77,5);
      System.out.println(number);  
 }
    //public int static findLargest(int numberOne, int numberTwo, int numberThree){
    public int findLargest(int numberOne, int numberTwo, int numberThree){
        int largest = numberOne; 
        //System.out.println(numberOne);     
    if (largest < numberTwo){
        largest = numberTwo;
        //System.out.println(numberTwo);
    }    
    if (largest < numberThree){
       largest = numberThree; 
        //System.out.println(numberThree);
        }
        return largest;
    }

    //public static void displayLargest(){
      //  findLargest(7, 8,20);
        //}
        
}
