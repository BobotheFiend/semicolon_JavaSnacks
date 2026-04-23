public class Triangle{
       public static void main(String[] args){

        int number = 5;
        int row = 1;
        System.out.printf(" *%n");
        System.out.printf(" '%n");
        for(;row <= number; row++){
            
                
            int coloums = 1;
            for(;coloums <=row; coloums++){
                System.out.print(" *-*");
            }
            System.out.printf("%n");
            int slash = 1;
            for(; slash <= row; slash++){
                System.out.print(" ' '");
            }
            System.out.printf("%n");
        }
    }
}
