public class FireDrillThree{
    public static void main(String[] args){
     //java.util.Scanner input = new java.util.Scanner(System.in);
     //System.out.print("Enter a Score: ");
     //int score = 0; //input.nextInt();
     int [] collections = {2,6,5,10,33,44,55,66,88,99,77};
     taskOne();
     System.out.printf("The even elements in the index: %d%n", taskFour(collections));
     System.out.printf("The odd elements in the index: %d%n", taskFive(collections));
     System.out.printf("The sum of the even elements in the index: %d%n", taskSix(collections));
     System.out.printf("The sum of the odd elements in the index: %d%n", taskSeven(collections));
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
    public static int taskFour(int [] collections){
        
        int count = 0;
        for(;count <= collections.length; count+=2){
             System.out.printf("%2d,", collections[count]);  
        }
        return collections[count];
        
    }
    public static int taskFive(int [] collections){
        int count = 1;
        for(;count < collections.length; count+=2){

            System.out.printf("%2d,", collections[count]);
        }
        return collections[count];
    }

    public static int taskSix(int [] collections){

        int count = 0;
        int sum = 0;

        for(;count < collections.length; count+=2){
            sum += collections[count];
             System.out.printf("%5d", collections[count]);
        }
        return sum;
    }
    
    public static int taskSeven(int [] collections){

        int count = 1;
        int sum = 0;

        for(;count < collections.length; count+=2){
            sum += collections[count];
             System.out.printf("%5d", collections[count]);
        }
        return sum;
    }
}
