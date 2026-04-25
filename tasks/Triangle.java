
public class Triangle{
    public static void main(String[] args){

       
        
        int row = 2000;
        for(;row < 2008;row++){
            int coloums = 2000;
            for(int space = row; space <= 2008; space++){
                System.out.printf(" ");
            }
            for(; coloums <  row; coloums++){
                 System.out.printf(" *");
            }
            System.out.printf("%n");
        }

        int bottom = 8;
        for(;bottom > 0;bottom--){
            int bottomColoums = bottom;
            for(; bottomColoums <= 8; bottomColoums++){
                 System.out.printf(" ");
            }
            for(int bottomSpace = bottom; bottomSpace > 0; bottomSpace--){
                System.out.printf(" *");
            }
            System.out.printf("%n");
        }
    }
} 
