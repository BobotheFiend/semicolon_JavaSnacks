public class PatternsDisplay{
    public static void main(String[] args){


    java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();
        //System.out.println();
    
        displayPatterns(userInput);

    }

    public static void displayPatterns(int number){
        int count = 1;
        for(;count <= number; count++){

            for(int innerCount = 1; innerCount <= count ; innerCount++){
                System.out.print(innerCount);
            }
            System.out.printf("%n");
        }
    }
}
