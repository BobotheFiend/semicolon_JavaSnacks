
public class TabularOutput{
    public static void main(String[] args){

        int number = 5;
        int count = 1;
        System.out.printf("N   N2    N3    N4%n");
        for(; count <= number; count++){
            
            int square = count*count;
            int cube = count*count*count;
            int raisedtoFour = count*count*count*count;
            System.out.printf("%d    %d    %d    %d%n", count, square, cube, raisedtoFour);
        }
        
    }
}
    
