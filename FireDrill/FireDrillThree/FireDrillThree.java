public class FireDrillThree{
    public static void main(String[] args){
     //java.util.Scanner input = new java.util.Scanner(System.in);
     //System.out.print("Enter a Score: ");
     //int score = 0; //input.nextInt();
     int [] collections = {2,6,5,10,33,44,55,66,88,99,77};
     //taskOne();
     System.out.printf("The even elements in the index: %s",java.util.Arrays.toString(taskFour(collections)));

     int [] odd = taskFive(collections);
     System.out.printf("The odd elements in the index: %s", java.util.Arrays.toString(odd));

     int evenSum = taskSix(collections);
     System.out.printf("The sum of the even elements in the index: %d",evenSum);

      int oddSum = taskSeven(collections);
     System.out.printf("The sum of the odd elements in the index:%d", oddSum);
    }

    public static void taskOne(){

    java.util.Scanner input = new java.util.Scanner(System.in);
   
    int [] collections = new int [10];
    int count = 0;
    for(;count < 10; count++){

        System.out.print("Enter a Score: ");
        int score = input.nextInt();

        collections[count] = score;     
    } 
        System.out.printf("%n%5s%n","Vertically");
        int counter = 0;
        for(;counter < collections.length; counter++){
        System.out.printf("%5d%n", collections[counter]);
        }
        
        System.out.printf("Horizontally %s%n",java.util.Arrays.toString(collections));

    }
    public static int [] taskFour(int [] collections){
        int [] evenArray = new int [(collections.length+1) /2];
        int count = 0;
        int indexCounter = 0;
        for(;count < collections.length; count+=2){
                evenArray[indexCounter++] = collections[count];
                //collections[indexCounter++] = collections[count];
             //System.out.printf("%d, ", collections[count]);  
        }      
        
    return evenArray;
    }
    public static int [] taskFive(int [] collections){
        int [] oddArray = new int [collections.length / 2];
        int count = 1;
        int indexCounter = 0;
        for(;count < collections.length; count+=2){

              oddArray[indexCounter++] = collections[count];
            //System.out.printf("%d, ", collections[count]);
        }

        return oddArray;
    }

    public static int taskSix(int [] collections){
               
        int [] evenArray = new int [(collections.length+1) /2];
        int sumEven = 0;
        int count = 0;
        int indexCounter = 0;
        for(;count < collections.length; count+=2){
                evenArray[indexCounter++] = collections[count];
                sumEven += evenArray[indexCounter];  
        } 
        return sumEven; 
    }
    
    public static int taskSeven(int [] collections){
        int [] oddArray = new int [collections.length /2];
        int sumOdd = 0;
        int count = 1;
        int indexCounter = 0;
        for(;count < collections.length; count+=2){
                oddArray[indexCounter++] = collections[count];
                sumOdd += oddArray[indexCounter];
        } 
        return sumOdd;
    }
}
