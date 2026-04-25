public class numbershapedrightangle{
    public static void main(String[] args){

        int count = 0;
        int row = 1;
        for(;row < 6;row++){
            
            int coloums = 0;
            for(; coloums <  row; coloums++){
                count++;
                 System.out.printf(" %d",count);
           
            }
            System.out.printf("%n"); 
        }
    }
}
