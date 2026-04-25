
public class rigthanglenumber{
    public static void main(String[] args){

       
        
        int row = 0;
        for(;row < 6;row++){
            int coloums = 0;
            for(; coloums <  row; coloums++){
                 System.out.printf(" *");
           
            }
            System.out.printf("%n"); 
        }

        for(int bottom = 6;bottom > 0;bottom--){
            int bottomColoum = 0;
            for(; bottomColoum < bottom; bottomColoum++){
                 System.out.printf(" *");
            }
           System.out.printf("%n"); 
        }  
    }
}
