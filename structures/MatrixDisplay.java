public class MatrixDisplay{
    public static void main (String[] args){

    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a number: ");
    int userInput = input.nextInt();
    printMatrix(userInput);
    }

    public static void printMatrix(int n){

        java.util.Random shuffle = new java.util.Random();

        
        int count = 1;
        for (;count <= n; count++){
            int innerLoop = 1;
            for(; innerLoop <= n; innerLoop++){
                int number = shuffle.nextInt(2);
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
