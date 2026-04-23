public class RightangledTriangle{
       public static void main(String[] args){

        int number = 10;
        int row = 1;
        for(;row <= number; row++){
            int coloums = 1;
            for(;coloums < row; coloums++){
                System.out.print("*");
            }
            System.out.printf("*%n");
        }
    }
}
