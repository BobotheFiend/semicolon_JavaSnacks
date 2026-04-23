public class RightangledTriangle{
       public static void main(String[] args){

        int number = 10;
        int row = 1;
        for(;row <= number; row++){
            int space = row;
            for(; space<= number; space++){
                System.out.print(" ");
                }
            
            int coloums = 1;
            for(;coloums <= number; coloums++){
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }
}
